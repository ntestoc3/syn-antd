(ns syn-antd.icons.message-filled
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/MessageFilled" :default MessageFilled]))

(def message-filled (reagent.core/adapt-react-class MessageFilled))