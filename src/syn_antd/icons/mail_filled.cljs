(ns syn-antd.icons.mail-filled
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/MailFilled" :default MailFilled]))

(def mail-filled (reagent.core/adapt-react-class MailFilled))