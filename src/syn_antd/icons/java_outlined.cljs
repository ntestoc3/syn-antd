(ns syn-antd.icons.java-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/JavaOutlined" :default JavaOutlined]))

(def java-outlined (reagent.core/adapt-react-class JavaOutlined))