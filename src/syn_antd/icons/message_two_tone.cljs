(ns syn-antd.icons.message-two-tone
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/MessageTwoTone" :default MessageTwoTone]))

(def message-two-tone (reagent.core/adapt-react-class MessageTwoTone))