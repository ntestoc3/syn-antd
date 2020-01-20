(ns syn-antd.icons.retweet-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/RetweetOutlined" :default RetweetOutlined]))

(def retweet-outlined (reagent.core/adapt-react-class RetweetOutlined))