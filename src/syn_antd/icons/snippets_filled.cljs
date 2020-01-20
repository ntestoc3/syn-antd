(ns syn-antd.icons.snippets-filled
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/SnippetsFilled" :default SnippetsFilled]))

(def snippets-filled (reagent.core/adapt-react-class SnippetsFilled))