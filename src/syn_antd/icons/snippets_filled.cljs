(ns syn-antd.icons.snippets-filled
  (:require
    [reagent.core]
    ["@ant-design/icons" :refer [SnippetsFilled]]))

(def snippets-filled (reagent.core/adapt-react-class SnippetsFilled))