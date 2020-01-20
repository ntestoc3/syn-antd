(ns syn-antd.icons.heart-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/HeartOutlined" :default HeartOutlined]))

(def heart-outlined (reagent.core/adapt-react-class HeartOutlined))