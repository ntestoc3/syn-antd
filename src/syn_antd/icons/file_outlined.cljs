(ns syn-antd.icons.file-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/FileOutlined" :default FileOutlined]))

(def file-outlined (reagent.core/adapt-react-class FileOutlined))