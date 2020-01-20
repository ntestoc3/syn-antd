(ns syn-antd.icons.appstore-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/AppstoreOutlined" :default AppstoreOutlined]))

(def appstore-outlined (reagent.core/adapt-react-class AppstoreOutlined))