(ns syn-antd.icons.wifi-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/WifiOutlined" :default WifiOutlined]))

(def wifi-outlined (reagent.core/adapt-react-class WifiOutlined))