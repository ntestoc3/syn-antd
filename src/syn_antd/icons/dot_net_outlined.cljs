(ns syn-antd.icons.dot-net-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/DotNetOutlined" :default DotNetOutlined]))

(def dot-net-outlined (reagent.core/adapt-react-class DotNetOutlined))