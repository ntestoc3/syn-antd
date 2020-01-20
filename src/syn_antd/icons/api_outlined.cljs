(ns syn-antd.icons.api-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/ApiOutlined" :default ApiOutlined]))

(def api-outlined (reagent.core/adapt-react-class ApiOutlined))