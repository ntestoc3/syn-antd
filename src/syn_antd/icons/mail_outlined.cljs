(ns syn-antd.icons.mail-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/MailOutlined" :default MailOutlined]))

(def mail-outlined (reagent.core/adapt-react-class MailOutlined))