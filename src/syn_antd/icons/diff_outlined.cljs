(ns syn-antd.icons.diff-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/DiffOutlined" :default DiffOutlined]))

(def diff-outlined (reagent.core/adapt-react-class DiffOutlined))