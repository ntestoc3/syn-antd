(ns syn-antd.icons.branches-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/BranchesOutlined" :default BranchesOutlined]))

(def branches-outlined (reagent.core/adapt-react-class BranchesOutlined))