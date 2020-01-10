(ns syn-antd.icons.lock-filled
  (:require
    [reagent.core]
    ["@ant-design/icons" :refer [LockFilled]]))

(def lock-filled (reagent.core/adapt-react-class LockFilled))