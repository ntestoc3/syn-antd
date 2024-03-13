(ns syn-antd.icons.muted-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/MutedOutlined" :default MutedOutlined]))

(def muted-outlined (reagent.core/adapt-react-class MutedOutlined))