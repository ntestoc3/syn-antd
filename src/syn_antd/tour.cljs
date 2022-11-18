(ns syn-antd.tour
  (:require
    [reagent.core]
    ["antd/es/tour" :default ant-tour]))

(def tour (reagent.core/adapt-react-class ant-tour))