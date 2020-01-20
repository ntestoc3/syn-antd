(ns syn-antd.icons.shake-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/ShakeOutlined" :default ShakeOutlined]))

(def shake-outlined (reagent.core/adapt-react-class ShakeOutlined))