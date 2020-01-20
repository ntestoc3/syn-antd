(ns syn-antd.icons.home-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/HomeOutlined" :default HomeOutlined]))

(def home-outlined (reagent.core/adapt-react-class HomeOutlined))