(ns syn-antd.icons.android-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons" :refer [AndroidOutlined]]))

(def android-outlined (reagent.core/adapt-react-class AndroidOutlined))