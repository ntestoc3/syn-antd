(ns syn-antd.icons.android-filled
  (:require
    [reagent.core]
    ["@ant-design/icons" :refer [AndroidFilled]]))

(def android-filled (reagent.core/adapt-react-class AndroidFilled))