(ns syn-antd.space
  (:require
    [reagent.core]
    ["antd/es/space" :default ant-space]))

(def space (reagent.core/adapt-react-class ant-space))