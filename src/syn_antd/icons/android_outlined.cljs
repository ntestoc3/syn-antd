(ns syn-antd.icons.android-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/AndroidOutlined" :default AndroidOutlined]))

(def android-outlined (reagent.core/adapt-react-class AndroidOutlined))