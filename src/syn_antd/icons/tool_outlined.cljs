(ns syn-antd.icons.tool-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/ToolOutlined" :default ToolOutlined]))

(def tool-outlined (reagent.core/adapt-react-class ToolOutlined))