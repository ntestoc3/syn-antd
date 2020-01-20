(ns syn-antd.icons.file-search-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/FileSearchOutlined" :default FileSearchOutlined]))

(def file-search-outlined (reagent.core/adapt-react-class FileSearchOutlined))