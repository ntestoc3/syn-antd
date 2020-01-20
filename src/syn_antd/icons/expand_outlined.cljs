(ns syn-antd.icons.expand-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/ExpandOutlined" :default ExpandOutlined]))

(def expand-outlined (reagent.core/adapt-react-class ExpandOutlined))