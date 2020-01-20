(ns syn-antd.icons.contacts-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/ContactsOutlined" :default ContactsOutlined]))

(def contacts-outlined (reagent.core/adapt-react-class ContactsOutlined))