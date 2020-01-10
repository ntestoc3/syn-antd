(ns syn-antd.icons.code-filled
  (:require
    [reagent.core]
    ["@ant-design/icons" :refer [CodeFilled]]))

(def code-filled (reagent.core/adapt-react-class CodeFilled))