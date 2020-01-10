(ns syn-antd.icons.icon-font
  (:require
    [reagent.core]
    ["@ant-design/icons" :refer [IconFont]]))

(def icon-font (reagent.core/adapt-react-class IconFont))