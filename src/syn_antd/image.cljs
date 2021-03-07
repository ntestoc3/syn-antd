(ns syn-antd.image
  (:require
    [reagent.core]
    ["antd/es/image" :default ant-image]))

(def image (reagent.core/adapt-react-class ant-image))

(def image-preview-group (reagent.core/adapt-react-class (.-PreviewGroup ant-image)))