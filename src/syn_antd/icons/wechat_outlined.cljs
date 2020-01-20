(ns syn-antd.icons.wechat-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/WechatOutlined" :default WechatOutlined]))

(def wechat-outlined (reagent.core/adapt-react-class WechatOutlined))