(ns user
  (:require [clojure.string :as string]
            [clojure.java.io :refer [as-file file make-parents reader]]
            [clojure.java.io :as io]))

(def ant
  [{:class "Affix"
    :path  "affix"}
   {:class "Alert"
    :path  "alert"}
   {:class "Anchor"
    :path  "anchor"
    :inner ["Link"]}
   {:class  "AutoComplete"
    :path   "auto-complete"
    :input? true
    :inner  [{:id     "Option"
              :input? false}]}
   {:class "Avatar"
    :path  "avatar"}
   {:class "BackTop"
    :path  "back-top"}
   {:class "Badge"
    :path  "badge"
    :inner ["Ribbon"]}
   {:class "Breadcrumb"
    :path  "breadcrumb"
    :inner ["Item"
            "Separator"]}
   {:class "Button"
    :path  "button"}
   {:class "Calendar"
    :path  "calendar"}
   {:class "Card"
    :path  "card"
    :inner ["Grid"
            "Meta"]}
   {:class "Carousel"
    :path  "carousel"}
   {:class "Cascader"
    :path  "cascader"}
   {:class "Checkbox"
    :path  "checkbox"
    :inner ["Group"]}
   {:class "Col"
    :path  "col"}
   {:class "Collapse"
    :path  "collapse"
    :inner ["Panel"]}
   {:class "Comment"
    :path  "comment"}
   {:class "ConfigProvider"
    :path  "config-provider"}
   {:class "DatePicker"
    :path  "date-picker"
    :inner ["MonthPicker"
            "RangePicker"
            "TimePicker"
            "WeekPicker"
            "YearPicker"]}
   {:class "Descriptions"
    :path  "descriptions"
    :inner ["Item"]}
   {:class "Divider"
    :path  "divider"}
   {:class "Drawer"
    :path  "drawer"}
   {:class "Dropdown"
    :path  "dropdown"
    :inner ["Button"]}
   {:class "Empty"
    :path  "empty"}
   {:class "Form"
    :path  "form"
    :inner ["Item"
            "List"
            "Provider"]}
   ;; TODO: maybe add useBreakpoint hook from grid?
   {:class "Image"
    :path "image"}
   {:class  "Input"
    :path   "input"
    :input? true
    :inner  [{:id     "Group"
              :input? true}
             {:id     "Password"
              :input? true}
             {:id     "Search"
              :input? true}
             {:id     "TextArea"
              :input? true}]}
   {:class "InputNumber"
    :path  "input-number"}
   {:class "Layout"
    :path  "layout"
    :inner ["Content"
            "Footer"
            "Header"
            "Sider"]}
   {:class "List"
    :path  "list"
    :inner ["Item"
            ["Item" "Meta"]]}
   {:class "LocaleProvider"                                 ;; DEPRECATED
    :path  "locale-provider"}
   {:class "Mentions"
    :path  "mentions"
    :inner ["Option"]}
   {:class "Menu"
    :path  "menu"
    :inner ["Divider"
            "Item"
            "ItemGroup"
            "SubMenu"]}
   {:path "message"
    :fns  ["(.-config ant-message)"
           "(.-destroy ant-message)"
           "(.-error ant-message)"
           "(.-info ant-message)"
           "(.-loading ant-message)"
           "(.-success ant-message)"
           "(.-warn ant-message)"
           "(.-warning ant-message)"]}
   {:class "Modal"
    :path  "modal"
    :fns   ["(.-confirm ant-modal)"
            "(.-error ant-modal)"
            "(.-info ant-modal)"
            "(.-success ant-modal)"
            "(.-warning ant-modal)"
            "(.-open ant-modal)"
            "(.-destroyAll ant-modal)"]}
   {:path "notification"
    :fns  ["(.-close ant-notification)"
           "(.-config ant-notification)"
           "(.-destroy ant-notification)"
           "(.-error ant-notification)"
           "(.-info ant-notification)"
           "(.-open ant-notification)"
           "(.-success ant-notification)"
           "(.-warn ant-notification)"
           "(.-warning ant-notification)"]}
   {:class "PageHeader"
    :path  "page-header"}
   {:class "Pagination"
    :path  "pagination"}
   {:class "Popconfirm"
    :path  "popconfirm"}
   {:class "Popover"
    :path  "popover"}
   {:class "Progress"
    :path  "progress"}
   {:class "Radio"
    :path  "radio"
    :inner ["Button"
            "Group"]}
   {:class "Rate"
    :path  "rate"}
   {:class "Result"
    :path  "result"}
   {:class "Row"
    :path  "row"}
   {:class  "Select"
    :path   "select"
    :inner  ["OptGroup"
             "Option"]
    :suffix "(defn ant-select-option [id-fn label-fn option]
  ^{:key (str \"antd-option-\" (id-fn option))}
  [select-option
   {:key      (id-fn option)
    :value    (id-fn option)
    :title    (label-fn option)
    :disabled (:disabled? option)}
   (label-fn option)])

(defn ant-options [{:keys [options id-fn label-fn]
                    :or   {id-fn    :id
                           label-fn :label}}]
  (let [option-fn (partial ant-select-option id-fn label-fn)]
    (map option-fn options)))"}
   {:class "Skeleton"
    :path  "skeleton"
    :inner ["Avatar"
            "Button"
            "Image"
            "Input"]}
   {:class "Slider"
    :path  "slider"}
   {:class "Space"
    :path  "space"}
   {:class "Spin"
    :path  "spin"}
   {:class "Statistic"
    :path  "statistic"}
   {:class "Steps"
    :path  "steps"
    :inner ["Step"]}
   {:class "Switch"
    :path  "switch"}
   {:class "Table"
    :path  "table"
    :inner ["Column"
            "ColumnGroup"]}
   {:class "Tabs"
    :path  "tabs"
    :inner ["TabPane"]}
   {:class "Tag"
    :path  "tag"
    :inner ["CheckableTag"]}
   {:class "TimePicker"
    :path  "time-picker"}
   {:class "Timeline"
    :path  "timeline"
    :inner ["Item"]}
   {:class "Tooltip"
    :path  "tooltip"}
   {:class "Transfer"
    :path  "transfer"}
   {:class "Tree"
    :path  "tree"
    :inner ["DirectoryTree"
            "TreeNode"]}
   {:class "TreeSelect"
    :path  "tree-select"
    :inner ["TreeNode"]}
   {:class "Typography"
    :path  "typography"
    :inner ["Text" "Title" "Paragraph" "Link"]}
   {:class "Upload"
    :path  "upload"}])

(defn module-name->any-case
  [case]
  (fn [input]
    (->> (re-seq #"\w[a-z0-9]*" input)
         (map string/lower-case)
         (string/join case))))

(def module-name->kebab-case (module-name->any-case "-"))
(def module-name->snake-case (module-name->any-case "_"))

(def get-symbol-name (comp symbol module-name->kebab-case))

(defn default-name [c]
  (str "ant-" (module-name->kebab-case c)))

(defn define-fn [f]
  (str "(defn " (get-symbol-name f) " [& args] (apply " f " args))"))

(defn define-reagent-component [component class-name input?]
  (str "(def " (get-symbol-name component)
       (when input? " (syn-antd.reagent-utils/fixed-async-input")
       " (reagent.core/adapt-react-class " class-name "))"
       (when input? ")")))

(defn default-js-wrapper [path default-name]
  (str "[\"" path "\" :default " default-name "]"))

(defn refer-js-wrapper [path name]
  (str "[\"" path "\" :refer [" name "]]"))

(defn factory-ns-shadow [class path default-name rest-of-file reagent? input? prefix js-wrapper]
  (str "(ns syn-antd." (when prefix (str prefix ".")) (module-name->kebab-case class) "\n"
       "  (:require\n"
       (when reagent? "    [reagent.core]\n")
       (when input? "    [syn-antd.reagent-utils]\n")
       "    " (js-wrapper path default-name) "))\n\n"
       rest-of-file))

(defn innerify [base [s & rest-s]]
  (if s
    (let [id (if (map? s)
               (:id s)
               s)]
      (innerify (str "(.-" id " " base ")")
                rest-s))
    base))

(defn file-listing [directory]
  (sequence
    (comp (remove #(.isDirectory %))
          (map (fn [f]
                 (.getName f))))
    (file-seq (io/file directory))))

(def ^:const base-icon-path "@ant-design/icons/es/icons")

(defn gen-namespace! [{:keys [base ant-base class path inner fns suffix input? ns-prefix
                              name-fn js-wrapper]
                       :or   {base       "src/syn_antd/"
                              name-fn    default-name
                              ant-base   "antd/es/"
                              input?     false
                              js-wrapper default-js-wrapper}}]
  (let [filename  (str base (module-name->snake-case (or class path)) ".cljs")
        default   (name-fn (or class path))
        file-body (string/join
                    "\n\n"
                    (concat
                      (when (some? class)

                        [(define-reagent-component class default input?)])
                      (when (some? inner)
                        (map (fn [entry]
                               (let [id (if (map? entry)
                                          (:id entry)
                                          entry)]
                                 (define-reagent-component (str class "." id)
                                                           (if (sequential? entry)
                                                             (innerify default entry)
                                                             (innerify default [entry]))
                                                           (:input? entry)))) inner))
                      (when (some? fns)
                        (map define-fn fns))
                      (when (some? suffix)
                        [suffix])))]
    (make-parents filename)
    (spit (as-file filename)
          (factory-ns-shadow (or class path) (str ant-base path) default file-body (some? class) input? ns-prefix js-wrapper))))

(defn gen-icons! []
  (doseq [icon (->> base-icon-path
                    (str "node_modules/")
                    (file-listing)
                    (filter #(string/ends-with? % ".js")))
          :let [class (subs icon 0 (- (count icon) 3))]]
    (gen-namespace! {:class      class
                     :path       class
                     :ant-base   (str base-icon-path "/")
                     :base       "src/syn_antd/icons/"
                     :ns-prefix  "icons"
                     :name-fn    identity
                     :js-wrapper default-js-wrapper})))

;; Inspiration taken from https://github.com/fulcrologic/semantic-ui-wrapper
(defn gen-factories! []
  (doseq [entry ant]
    (gen-namespace! entry))
  (gen-icons!))