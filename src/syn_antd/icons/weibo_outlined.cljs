(ns syn-antd.icons.weibo-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/WeiboOutlined" :default WeiboOutlined]))

(def weibo-outlined (reagent.core/adapt-react-class WeiboOutlined))