(ns syn-antd.icons.signal-filled
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/SignalFilled" :default SignalFilled]))

(def signal-filled (reagent.core/adapt-react-class SignalFilled))