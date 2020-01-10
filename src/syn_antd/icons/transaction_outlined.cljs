(ns syn-antd.icons.transaction-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons" :refer [TransactionOutlined]]))

(def transaction-outlined (reagent.core/adapt-react-class TransactionOutlined))