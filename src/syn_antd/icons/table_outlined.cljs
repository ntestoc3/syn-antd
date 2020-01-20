(ns syn-antd.icons.table-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/TableOutlined" :default TableOutlined]))

(def table-outlined (reagent.core/adapt-react-class TableOutlined))