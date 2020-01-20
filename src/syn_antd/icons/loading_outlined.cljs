(ns syn-antd.icons.loading-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/LoadingOutlined" :default LoadingOutlined]))

(def loading-outlined (reagent.core/adapt-react-class LoadingOutlined))