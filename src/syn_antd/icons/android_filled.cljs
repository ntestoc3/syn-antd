(ns syn-antd.icons.android-filled
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/AndroidFilled" :default AndroidFilled]))

(def android-filled (reagent.core/adapt-react-class AndroidFilled))