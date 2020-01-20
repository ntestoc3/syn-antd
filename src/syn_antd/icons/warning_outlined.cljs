(ns syn-antd.icons.warning-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/WarningOutlined" :default WarningOutlined]))

(def warning-outlined (reagent.core/adapt-react-class WarningOutlined))