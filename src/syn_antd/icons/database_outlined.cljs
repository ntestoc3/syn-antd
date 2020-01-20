(ns syn-antd.icons.database-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/DatabaseOutlined" :default DatabaseOutlined]))

(def database-outlined (reagent.core/adapt-react-class DatabaseOutlined))