(ns syn-antd.icons.close-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/CloseOutlined" :default CloseOutlined]))

(def close-outlined (reagent.core/adapt-react-class CloseOutlined))