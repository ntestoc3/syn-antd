(ns syn-antd.icons.sketch-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/SketchOutlined" :default SketchOutlined]))

(def sketch-outlined (reagent.core/adapt-react-class SketchOutlined))