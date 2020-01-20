(ns syn-antd.icons.bars-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/BarsOutlined" :default BarsOutlined]))

(def bars-outlined (reagent.core/adapt-react-class BarsOutlined))