(ns syn-antd.icons.highlight-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/HighlightOutlined" :default HighlightOutlined]))

(def highlight-outlined (reagent.core/adapt-react-class HighlightOutlined))