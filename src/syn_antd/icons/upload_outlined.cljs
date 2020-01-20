(ns syn-antd.icons.upload-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/UploadOutlined" :default UploadOutlined]))

(def upload-outlined (reagent.core/adapt-react-class UploadOutlined))