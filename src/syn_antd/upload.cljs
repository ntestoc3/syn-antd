(ns syn-antd.upload
  (:require
    [reagent.core]
    ["antd/es/upload" :default ant-upload]))

(def upload (reagent.core/adapt-react-class ant-upload))

(def upload-dragger (reagent.core/adapt-react-class (.-Dragger ant-upload)))