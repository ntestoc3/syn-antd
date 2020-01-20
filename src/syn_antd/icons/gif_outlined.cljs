(ns syn-antd.icons.gif-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/GifOutlined" :default GifOutlined]))

(def gif-outlined (reagent.core/adapt-react-class GifOutlined))