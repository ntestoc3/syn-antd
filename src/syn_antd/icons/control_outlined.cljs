(ns syn-antd.icons.control-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/ControlOutlined" :default ControlOutlined]))

(def control-outlined (reagent.core/adapt-react-class ControlOutlined))