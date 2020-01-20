(ns syn-antd.icons.comment-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/CommentOutlined" :default CommentOutlined]))

(def comment-outlined (reagent.core/adapt-react-class CommentOutlined))