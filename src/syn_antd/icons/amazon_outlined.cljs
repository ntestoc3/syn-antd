(ns syn-antd.icons.amazon-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/AmazonOutlined" :default AmazonOutlined]))

(def amazon-outlined (reagent.core/adapt-react-class AmazonOutlined))