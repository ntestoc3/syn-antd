(ns syn-antd.icons.bar-chart-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/BarChartOutlined" :default BarChartOutlined]))

(def bar-chart-outlined (reagent.core/adapt-react-class BarChartOutlined))