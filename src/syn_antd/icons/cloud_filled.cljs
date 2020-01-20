(ns syn-antd.icons.cloud-filled
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/CloudFilled" :default CloudFilled]))

(def cloud-filled (reagent.core/adapt-react-class CloudFilled))