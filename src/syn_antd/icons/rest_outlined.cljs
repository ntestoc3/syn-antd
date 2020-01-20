(ns syn-antd.icons.rest-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/RestOutlined" :default RestOutlined]))

(def rest-outlined (reagent.core/adapt-react-class RestOutlined))