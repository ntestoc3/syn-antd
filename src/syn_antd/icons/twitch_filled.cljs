(ns syn-antd.icons.twitch-filled
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/TwitchFilled" :default TwitchFilled]))

(def twitch-filled (reagent.core/adapt-react-class TwitchFilled))