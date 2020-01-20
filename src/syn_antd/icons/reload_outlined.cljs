(ns syn-antd.icons.reload-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/ReloadOutlined" :default ReloadOutlined]))

(def reload-outlined (reagent.core/adapt-react-class ReloadOutlined))