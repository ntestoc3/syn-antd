(ns syn-antd.icons.heart-filled
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/HeartFilled" :default HeartFilled]))

(def heart-filled (reagent.core/adapt-react-class HeartFilled))