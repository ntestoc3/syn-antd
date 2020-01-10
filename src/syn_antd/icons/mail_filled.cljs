(ns syn-antd.icons.mail-filled
  (:require
    [reagent.core]
    ["@ant-design/icons" :refer [MailFilled]]))

(def mail-filled (reagent.core/adapt-react-class MailFilled))