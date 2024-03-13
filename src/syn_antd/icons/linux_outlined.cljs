(ns syn-antd.icons.linux-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/LinuxOutlined" :default LinuxOutlined]))

(def linux-outlined (reagent.core/adapt-react-class LinuxOutlined))