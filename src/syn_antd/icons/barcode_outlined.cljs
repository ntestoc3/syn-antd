(ns syn-antd.icons.barcode-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/BarcodeOutlined" :default BarcodeOutlined]))

(def barcode-outlined (reagent.core/adapt-react-class BarcodeOutlined))