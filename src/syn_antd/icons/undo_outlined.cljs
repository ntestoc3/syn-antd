(ns syn-antd.icons.undo-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/UndoOutlined" :default UndoOutlined]))

(def undo-outlined (reagent.core/adapt-react-class UndoOutlined))