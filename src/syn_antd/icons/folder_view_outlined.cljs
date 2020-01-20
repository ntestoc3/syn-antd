(ns syn-antd.icons.folder-view-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/FolderViewOutlined" :default FolderViewOutlined]))

(def folder-view-outlined (reagent.core/adapt-react-class FolderViewOutlined))