(ns syn-antd.button
  (:require
    [reagent.core]
    ["antd/es/button" :default ant-button]))

(def button (reagent.core/adapt-react-class ant-button))