(ns syn-antd.icons.signature-filled
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/SignatureFilled" :default SignatureFilled]))

(def signature-filled (reagent.core/adapt-react-class SignatureFilled))