(ns syn-antd.icons.message-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons" :refer [MessageOutlined]]))

(def message-outlined (reagent.core/adapt-react-class MessageOutlined))