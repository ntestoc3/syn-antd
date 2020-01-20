(ns syn-antd.icons.contacts-filled
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/ContactsFilled" :default ContactsFilled]))

(def contacts-filled (reagent.core/adapt-react-class ContactsFilled))