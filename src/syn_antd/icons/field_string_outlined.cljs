(ns syn-antd.icons.field-string-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/FieldStringOutlined" :default FieldStringOutlined]))

(def field-string-outlined (reagent.core/adapt-react-class FieldStringOutlined))