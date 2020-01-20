(ns syn-antd.icons.tag-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/TagOutlined" :default TagOutlined]))

(def tag-outlined (reagent.core/adapt-react-class TagOutlined))