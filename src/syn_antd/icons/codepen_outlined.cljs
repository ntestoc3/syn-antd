(ns syn-antd.icons.codepen-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/CodepenOutlined" :default CodepenOutlined]))

(def codepen-outlined (reagent.core/adapt-react-class CodepenOutlined))