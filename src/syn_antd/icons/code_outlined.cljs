(ns syn-antd.icons.code-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons" :refer [CodeOutlined]]))

(def code-outlined (reagent.core/adapt-react-class CodeOutlined))