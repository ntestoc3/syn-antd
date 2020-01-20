(ns syn-antd.icons.bold-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/BoldOutlined" :default BoldOutlined]))

(def bold-outlined (reagent.core/adapt-react-class BoldOutlined))