(ns syn-antd.icons.code-filled
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/CodeFilled" :default CodeFilled]))

(def code-filled (reagent.core/adapt-react-class CodeFilled))