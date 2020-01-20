(ns syn-antd.icons.compass-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/CompassOutlined" :default CompassOutlined]))

(def compass-outlined (reagent.core/adapt-react-class CompassOutlined))