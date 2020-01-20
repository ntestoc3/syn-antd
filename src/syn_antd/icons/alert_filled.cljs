(ns syn-antd.icons.alert-filled
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/AlertFilled" :default AlertFilled]))

(def alert-filled (reagent.core/adapt-react-class AlertFilled))