(ns syn-antd.icons.pushpin-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/PushpinOutlined" :default PushpinOutlined]))

(def pushpin-outlined (reagent.core/adapt-react-class PushpinOutlined))