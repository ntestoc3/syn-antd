(ns syn-antd.icons.clear-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/ClearOutlined" :default ClearOutlined]))

(def clear-outlined (reagent.core/adapt-react-class ClearOutlined))