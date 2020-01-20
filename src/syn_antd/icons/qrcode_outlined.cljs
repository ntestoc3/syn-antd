(ns syn-antd.icons.qrcode-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/QrcodeOutlined" :default QrcodeOutlined]))

(def qrcode-outlined (reagent.core/adapt-react-class QrcodeOutlined))