(ns syn-antd.icons.shopping-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/ShoppingOutlined" :default ShoppingOutlined]))

(def shopping-outlined (reagent.core/adapt-react-class ShoppingOutlined))