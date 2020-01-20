(ns syn-antd.icons.lock-filled
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/LockFilled" :default LockFilled]))

(def lock-filled (reagent.core/adapt-react-class LockFilled))