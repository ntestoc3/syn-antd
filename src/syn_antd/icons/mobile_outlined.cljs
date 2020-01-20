(ns syn-antd.icons.mobile-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/MobileOutlined" :default MobileOutlined]))

(def mobile-outlined (reagent.core/adapt-react-class MobileOutlined))