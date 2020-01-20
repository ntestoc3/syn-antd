(ns syn-antd.icons.send-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/SendOutlined" :default SendOutlined]))

(def send-outlined (reagent.core/adapt-react-class SendOutlined))