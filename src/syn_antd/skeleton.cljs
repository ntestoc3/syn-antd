(ns syn-antd.skeleton
  (:require
    [reagent.core]
    ["antd/es/skeleton" :default ant-skeleton]))

(def skeleton (reagent.core/adapt-react-class ant-skeleton))

(def skeleton-avatar (reagent.core/adapt-react-class (.-Avatar ant-skeleton)))

(def skeleton-button (reagent.core/adapt-react-class (.-Button ant-skeleton)))

(def skeleton-image (reagent.core/adapt-react-class (.-Image ant-skeleton)))

(def skeleton-input (reagent.core/adapt-react-class (.-Input ant-skeleton)))