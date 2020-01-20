(ns syn-antd.icons.bg-colors-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/BgColorsOutlined" :default BgColorsOutlined]))

(def bg-colors-outlined (reagent.core/adapt-react-class BgColorsOutlined))