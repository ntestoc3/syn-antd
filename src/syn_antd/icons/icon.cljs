(ns syn-antd.icons.icon
  (:require
    [reagent.core]
    ["@ant-design/icons" :refer [Icon]]))

(def icon (reagent.core/adapt-react-class Icon))