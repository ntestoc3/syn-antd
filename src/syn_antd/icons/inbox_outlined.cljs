(ns syn-antd.icons.inbox-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/InboxOutlined" :default InboxOutlined]))

(def inbox-outlined (reagent.core/adapt-react-class InboxOutlined))