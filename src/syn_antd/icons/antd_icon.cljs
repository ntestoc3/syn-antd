(ns syn-antd.icons.antd-icon
  (:require
    [reagent.core]
    ["@ant-design/icons" :refer [AntdIcon]]))

(def antd-icon (reagent.core/adapt-react-class AntdIcon))