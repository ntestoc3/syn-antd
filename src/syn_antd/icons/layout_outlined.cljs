(ns syn-antd.icons.layout-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/LayoutOutlined" :default LayoutOutlined]))

(def layout-outlined (reagent.core/adapt-react-class LayoutOutlined))