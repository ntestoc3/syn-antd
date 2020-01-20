(ns syn-antd.icons.index
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/index" :default index]))

(def index (reagent.core/adapt-react-class index))