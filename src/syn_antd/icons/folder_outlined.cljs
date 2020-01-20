(ns syn-antd.icons.folder-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/FolderOutlined" :default FolderOutlined]))

(def folder-outlined (reagent.core/adapt-react-class FolderOutlined))