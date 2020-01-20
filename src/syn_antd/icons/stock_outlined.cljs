(ns syn-antd.icons.stock-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/StockOutlined" :default StockOutlined]))

(def stock-outlined (reagent.core/adapt-react-class StockOutlined))