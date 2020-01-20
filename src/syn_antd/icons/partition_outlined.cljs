(ns syn-antd.icons.partition-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/PartitionOutlined" :default PartitionOutlined]))

(def partition-outlined (reagent.core/adapt-react-class PartitionOutlined))