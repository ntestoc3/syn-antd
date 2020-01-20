(ns syn-antd.icons.environment-filled
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/EnvironmentFilled" :default EnvironmentFilled]))

(def environment-filled (reagent.core/adapt-react-class EnvironmentFilled))