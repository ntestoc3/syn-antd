(ns syn-antd.icons.cloud-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/CloudOutlined" :default CloudOutlined]))

(def cloud-outlined (reagent.core/adapt-react-class CloudOutlined))