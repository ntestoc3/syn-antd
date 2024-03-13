(ns syn-antd.icons.signature-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/SignatureOutlined" :default SignatureOutlined]))

(def signature-outlined (reagent.core/adapt-react-class SignatureOutlined))