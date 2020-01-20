(ns syn-antd.icons.plus-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/PlusOutlined" :default PlusOutlined]))

(def plus-outlined (reagent.core/adapt-react-class PlusOutlined))