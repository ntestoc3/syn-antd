(ns syn-antd.icons.exception-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/ExceptionOutlined" :default ExceptionOutlined]))

(def exception-outlined (reagent.core/adapt-react-class ExceptionOutlined))