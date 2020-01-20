(ns syn-antd.icons.tags-filled
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/TagsFilled" :default TagsFilled]))

(def tags-filled (reagent.core/adapt-react-class TagsFilled))