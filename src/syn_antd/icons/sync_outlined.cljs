(ns syn-antd.icons.sync-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/SyncOutlined" :default SyncOutlined]))

(def sync-outlined (reagent.core/adapt-react-class SyncOutlined))