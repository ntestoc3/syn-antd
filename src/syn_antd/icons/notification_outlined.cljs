(ns syn-antd.icons.notification-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons" :refer [NotificationOutlined]]))

(def notification-outlined (reagent.core/adapt-react-class NotificationOutlined))