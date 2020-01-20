(ns syn-antd.icons.sliders-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/SlidersOutlined" :default SlidersOutlined]))

(def sliders-outlined (reagent.core/adapt-react-class SlidersOutlined))