(ns syn-antd.icons.field-number-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/FieldNumberOutlined" :default FieldNumberOutlined]))

(def field-number-outlined (reagent.core/adapt-react-class FieldNumberOutlined))