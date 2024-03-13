(ns syn-antd.icons.kubernetes-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/KubernetesOutlined" :default KubernetesOutlined]))

(def kubernetes-outlined (reagent.core/adapt-react-class KubernetesOutlined))