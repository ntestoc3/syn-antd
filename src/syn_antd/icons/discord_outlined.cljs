(ns syn-antd.icons.discord-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/DiscordOutlined" :default DiscordOutlined]))

(def discord-outlined (reagent.core/adapt-react-class DiscordOutlined))