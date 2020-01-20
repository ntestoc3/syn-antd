(ns syn-antd.icons.skin-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/SkinOutlined" :default SkinOutlined]))

(def skin-outlined (reagent.core/adapt-react-class SkinOutlined))