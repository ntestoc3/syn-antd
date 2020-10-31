(ns syn-antd.form-page
  (:require
    [syn-antd.button :as button]
    [syn-antd.checkbox :as checkbox]
    [syn-antd.input :as input]
    [syn-antd.form :as form]
    [syn-antd.dev :as dev]
    [reagent.core :as reagent]
    [re-frame.core :as re-frame])
  (:require-macros [syn-antd.util :refer [source]]))

(defn basic-form
  []
  [form/form
   {:label-col        {:span 8}
    :wrapper-col      {:span 16}
    :name             "basic"
    :initial-values   {:remember true}
    :on-finish        (fn [values] (js/console.log "Success:" values))
    :on-finish-failed (fn [values] (js/console.log "Failed:" values))}
   [form/form-item
    {:label "Username"
     :name  "username"
     :rules [{:required true
              :message  "Please input your username!"}]}
    [input/input-raw]]
   [form/form-item
    {:label "Password"
     :name  "password"
     :rules [{:required true
              :message  "Please input your password!"}]}
    [input/input-password-raw]]
   [form/form-item
    {:name            "remember"
     :value-prop-name "checked"
     :wrapper-col     {:offset 8 :span 16}}
    [checkbox/checkbox "Remember me"]]
   [form/form-item
    {:wrapper-col {:offset 8 :span 16}}
    [button/button {:type      "primary"
                    :html-type "submit"}
     "Submit"]]])

(defn basic-form-elem
  []
  [dev/demo-element
   "Basic form"
   (source basic-form)
   [basic-form]])

(defn rf-form
  []
  (let [state     (re-frame/subscribe [::form-state])
        on-change (fn [changed-fields all-fields]
                    (re-frame/dispatch [::set-value ::form-state all-fields]))]
    (fn []
      [form/form
       {:name             "global-state"
        :layout           "inline"
        :fields           @state
        :on-fields-change on-change}
       [form/form-item
        {:name  "username"
         :label "Username"
         :rules [{:required true
                  :message  "Username is required!"}]}
        [input/input-raw]]])))

(defn rf-form-elem
  []
  [dev/demo-element
   "Controlled form (re-frame)"
   (source rf-form)
   [:<>
    [rf-form]
    [:div>pre "Re-frame ::form-state\n\n" (pr-str @(re-frame/subscribe [::form-state]))]]])

(defn reagent-form
  []
  (let [state     (reagent/atom [{:name "username"
                                  :value "Ant Design"}])
        on-change (fn [changed-fields all-fields]
                    (reset! state [::set-value ::form-state all-fields]))]
    (fn []
      [form/form
       {:name             "global-state"
        :layout           "inline"
        :fields           @state
        :on-fields-change on-change}
       [form/form-item
        {:name  "username"
         :label "Username"
         :rules [{:required true
                  :message  "Username is required!"}]}
        [input/input-raw]]])))

(defn reagent-form-elem
  []
  [dev/demo-element
   "Controlled form (reagent)"
   (source reagent-form)
   [:<>
    [reagent-form]]])

;; PAGE
(defn test-form-page []
  (dev/demo-page
    {:title      "syn-antd.form"
     :link       "https://ant.design/components/form/"
     :link-title "antd Documentation - Form"
     :elements   [:<>
                  [basic-form-elem]
                  [rf-form-elem]
                  [reagent-form-elem]]}))


;; RE FRAME STUFFS

(re-frame/reg-sub ::form-state (fn [db _] (::form-state db)))

(re-frame/reg-event-db
  ::init
  (fn [db _]
    (assoc db ::form-state [{:name  "username"
                             :value "Ant Design"}])))

(re-frame/reg-event-db
  ::set-value
  (fn [db [_ k v]]
    (assoc db k v)))