(ns syn-antd.icons.reddit-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/RedditOutlined" :default RedditOutlined]))

(def reddit-outlined (reagent.core/adapt-react-class RedditOutlined))