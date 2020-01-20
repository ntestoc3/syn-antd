(ns syn-antd.icons.export-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/ExportOutlined" :default ExportOutlined]))

(def export-outlined (reagent.core/adapt-react-class ExportOutlined))