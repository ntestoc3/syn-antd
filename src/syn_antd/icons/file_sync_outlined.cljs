(ns syn-antd.icons.file-sync-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/FileSyncOutlined" :default FileSyncOutlined]))

(def file-sync-outlined (reagent.core/adapt-react-class FileSyncOutlined))