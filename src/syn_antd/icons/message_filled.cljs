(ns syn-antd.icons.message-filled
  (:require
    [reagent.core]
    ["@ant-design/icons" :refer [MessageFilled]]))

(def message-filled (reagent.core/adapt-react-class MessageFilled))