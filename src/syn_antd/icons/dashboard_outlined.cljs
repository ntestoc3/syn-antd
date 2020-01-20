(ns syn-antd.icons.dashboard-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/DashboardOutlined" :default DashboardOutlined]))

(def dashboard-outlined (reagent.core/adapt-react-class DashboardOutlined))