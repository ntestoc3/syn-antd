(ns syn-antd.icons.question-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/QuestionOutlined" :default QuestionOutlined]))

(def question-outlined (reagent.core/adapt-react-class QuestionOutlined))