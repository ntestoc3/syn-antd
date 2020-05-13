(ns syn-antd.form
  (:require
    [reagent.core]
    ["antd/es/form" :default ant-form]))

(def form (reagent.core/adapt-react-class ant-form))

(def form-item (reagent.core/adapt-react-class (.-Item ant-form)))

(def form-list (reagent.core/adapt-react-class (.-List ant-form)))

(def form-provider (reagent.core/adapt-react-class (.-Provider ant-form)))