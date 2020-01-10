(ns syn-antd.icons.qrcode-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons" :refer [QrcodeOutlined]]))

(def qrcode-outlined (reagent.core/adapt-react-class QrcodeOutlined))