(ns syn-antd.icons.notification-filled
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/NotificationFilled" :default NotificationFilled]))

(def notification-filled (reagent.core/adapt-react-class NotificationFilled))