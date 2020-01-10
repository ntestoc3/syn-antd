(ns syn-antd.icons.layout-filled
  (:require
    [reagent.core]
    ["@ant-design/icons" :refer [LayoutFilled]]))

(def layout-filled (reagent.core/adapt-react-class LayoutFilled))