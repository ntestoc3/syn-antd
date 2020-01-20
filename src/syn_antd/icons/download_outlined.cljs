(ns syn-antd.icons.download-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/DownloadOutlined" :default DownloadOutlined]))

(def download-outlined (reagent.core/adapt-react-class DownloadOutlined))