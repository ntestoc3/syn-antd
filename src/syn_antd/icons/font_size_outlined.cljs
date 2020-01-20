(ns syn-antd.icons.font-size-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/FontSizeOutlined" :default FontSizeOutlined]))

(def font-size-outlined (reagent.core/adapt-react-class FontSizeOutlined))