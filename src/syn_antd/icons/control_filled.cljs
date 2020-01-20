(ns syn-antd.icons.control-filled
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/ControlFilled" :default ControlFilled]))

(def control-filled (reagent.core/adapt-react-class ControlFilled))