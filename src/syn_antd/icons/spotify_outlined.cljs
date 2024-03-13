(ns syn-antd.icons.spotify-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/SpotifyOutlined" :default SpotifyOutlined]))

(def spotify-outlined (reagent.core/adapt-react-class SpotifyOutlined))