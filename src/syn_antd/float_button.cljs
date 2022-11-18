(ns syn-antd.float-button
  (:require
    [reagent.core]
    ["antd/es/float-button" :default ant-float-button]))

(def float-button (reagent.core/adapt-react-class ant-float-button))

(def float-button-back-top (reagent.core/adapt-react-class (.-BackTop ant-float-button)))