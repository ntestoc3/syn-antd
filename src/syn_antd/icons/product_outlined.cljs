(ns syn-antd.icons.product-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/ProductOutlined" :default ProductOutlined]))

(def product-outlined (reagent.core/adapt-react-class ProductOutlined))