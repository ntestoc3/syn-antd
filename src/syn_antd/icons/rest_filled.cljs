(ns syn-antd.icons.rest-filled
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/RestFilled" :default RestFilled]))

(def rest-filled (reagent.core/adapt-react-class RestFilled))