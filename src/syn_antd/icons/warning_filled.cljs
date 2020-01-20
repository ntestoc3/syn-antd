(ns syn-antd.icons.warning-filled
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/WarningFilled" :default WarningFilled]))

(def warning-filled (reagent.core/adapt-react-class WarningFilled))