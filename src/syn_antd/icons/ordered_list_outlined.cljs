(ns syn-antd.icons.ordered-list-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/OrderedListOutlined" :default OrderedListOutlined]))

(def ordered-list-outlined (reagent.core/adapt-react-class OrderedListOutlined))