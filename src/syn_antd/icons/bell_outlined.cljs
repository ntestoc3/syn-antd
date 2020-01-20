(ns syn-antd.icons.bell-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/BellOutlined" :default BellOutlined]))

(def bell-outlined (reagent.core/adapt-react-class BellOutlined))