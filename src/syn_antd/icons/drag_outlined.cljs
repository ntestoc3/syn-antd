(ns syn-antd.icons.drag-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/DragOutlined" :default DragOutlined]))

(def drag-outlined (reagent.core/adapt-react-class DragOutlined))