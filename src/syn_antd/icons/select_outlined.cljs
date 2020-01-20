(ns syn-antd.icons.select-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/SelectOutlined" :default SelectOutlined]))

(def select-outlined (reagent.core/adapt-react-class SelectOutlined))