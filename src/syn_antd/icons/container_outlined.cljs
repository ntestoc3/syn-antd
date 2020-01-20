(ns syn-antd.icons.container-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/ContainerOutlined" :default ContainerOutlined]))

(def container-outlined (reagent.core/adapt-react-class ContainerOutlined))