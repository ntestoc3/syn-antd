(ns syn-antd.icons.lock-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/LockOutlined" :default LockOutlined]))

(def lock-outlined (reagent.core/adapt-react-class LockOutlined))