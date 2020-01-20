(ns syn-antd.icons.desktop-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/DesktopOutlined" :default DesktopOutlined]))

(def desktop-outlined (reagent.core/adapt-react-class DesktopOutlined))