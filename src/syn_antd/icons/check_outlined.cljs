(ns syn-antd.icons.check-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/CheckOutlined" :default CheckOutlined]))

(def check-outlined (reagent.core/adapt-react-class CheckOutlined))