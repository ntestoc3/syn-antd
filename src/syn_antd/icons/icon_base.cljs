(ns syn-antd.icons.icon-base
  (:require
    [reagent.core]
    ["@ant-design/icons" :refer [IconBase]]))

(def icon-base (reagent.core/adapt-react-class IconBase))