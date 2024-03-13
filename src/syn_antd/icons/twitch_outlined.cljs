(ns syn-antd.icons.twitch-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/TwitchOutlined" :default TwitchOutlined]))

(def twitch-outlined (reagent.core/adapt-react-class TwitchOutlined))