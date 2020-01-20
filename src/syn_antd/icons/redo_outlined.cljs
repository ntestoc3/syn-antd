(ns syn-antd.icons.redo-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/RedoOutlined" :default RedoOutlined]))

(def redo-outlined (reagent.core/adapt-react-class RedoOutlined))