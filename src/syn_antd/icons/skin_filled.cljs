(ns syn-antd.icons.skin-filled
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/SkinFilled" :default SkinFilled]))

(def skin-filled (reagent.core/adapt-react-class SkinFilled))