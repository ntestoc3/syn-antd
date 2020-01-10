(ns syn-antd.icons.snippets-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons" :refer [SnippetsOutlined]]))

(def snippets-outlined (reagent.core/adapt-react-class SnippetsOutlined))