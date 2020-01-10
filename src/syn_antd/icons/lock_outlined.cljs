(ns syn-antd.icons.lock-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons" :refer [LockOutlined]]))

(def lock-outlined (reagent.core/adapt-react-class LockOutlined))