(ns syn-antd.icons.tag-filled
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/TagFilled" :default TagFilled]))

(def tag-filled (reagent.core/adapt-react-class TagFilled))