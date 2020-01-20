(ns syn-antd.icons.ellipsis-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/EllipsisOutlined" :default EllipsisOutlined]))

(def ellipsis-outlined (reagent.core/adapt-react-class EllipsisOutlined))