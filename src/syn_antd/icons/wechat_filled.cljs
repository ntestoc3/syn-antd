(ns syn-antd.icons.wechat-filled
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/WechatFilled" :default WechatFilled]))

(def wechat-filled (reagent.core/adapt-react-class WechatFilled))