(ns syn-antd.icons.gateway-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/GatewayOutlined" :default GatewayOutlined]))

(def gateway-outlined (reagent.core/adapt-react-class GatewayOutlined))