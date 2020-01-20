(ns syn-antd.icons.global-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/GlobalOutlined" :default GlobalOutlined]))

(def global-outlined (reagent.core/adapt-react-class GlobalOutlined))