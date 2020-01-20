(ns syn-antd.icons.logout-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/LogoutOutlined" :default LogoutOutlined]))

(def logout-outlined (reagent.core/adapt-react-class LogoutOutlined))