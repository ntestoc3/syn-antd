(ns syn-antd.icons.warning-filled
  (:require
    [reagent.core]
    ["@ant-design/icons" :refer [WarningFilled]]))

(def warning-filled (reagent.core/adapt-react-class WarningFilled))