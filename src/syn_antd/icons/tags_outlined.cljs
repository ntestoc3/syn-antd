(ns syn-antd.icons.tags-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons" :refer [TagsOutlined]]))

(def tags-outlined (reagent.core/adapt-react-class TagsOutlined))