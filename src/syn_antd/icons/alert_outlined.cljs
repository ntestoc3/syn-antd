(ns syn-antd.icons.alert-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/AlertOutlined" :default AlertOutlined]))

(def alert-outlined (reagent.core/adapt-react-class AlertOutlined))