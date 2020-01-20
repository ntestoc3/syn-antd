(ns syn-antd.icons.form-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/FormOutlined" :default FormOutlined]))

(def form-outlined (reagent.core/adapt-react-class FormOutlined))