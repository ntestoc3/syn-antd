(ns syn-antd.icons.enter-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/EnterOutlined" :default EnterOutlined]))

(def enter-outlined (reagent.core/adapt-react-class EnterOutlined))