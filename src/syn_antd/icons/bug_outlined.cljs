(ns syn-antd.icons.bug-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/BugOutlined" :default BugOutlined]))

(def bug-outlined (reagent.core/adapt-react-class BugOutlined))