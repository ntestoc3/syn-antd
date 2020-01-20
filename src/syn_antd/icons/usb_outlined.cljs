(ns syn-antd.icons.usb-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/UsbOutlined" :default UsbOutlined]))

(def usb-outlined (reagent.core/adapt-react-class UsbOutlined))