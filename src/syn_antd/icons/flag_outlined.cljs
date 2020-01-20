(ns syn-antd.icons.flag-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/FlagOutlined" :default FlagOutlined]))

(def flag-outlined (reagent.core/adapt-react-class FlagOutlined))