(ns syn-antd.icons.picture-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/PictureOutlined" :default PictureOutlined]))

(def picture-outlined (reagent.core/adapt-react-class PictureOutlined))