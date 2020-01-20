(ns syn-antd.icons.snippets-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/SnippetsOutlined" :default SnippetsOutlined]))

(def snippets-outlined (reagent.core/adapt-react-class SnippetsOutlined))