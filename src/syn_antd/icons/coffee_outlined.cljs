(ns syn-antd.icons.coffee-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/CoffeeOutlined" :default CoffeeOutlined]))

(def coffee-outlined (reagent.core/adapt-react-class CoffeeOutlined))