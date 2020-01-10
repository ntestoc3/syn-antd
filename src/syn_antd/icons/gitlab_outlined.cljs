(ns syn-antd.icons.gitlab-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons" :refer [GitlabOutlined]]))

(def gitlab-outlined (reagent.core/adapt-react-class GitlabOutlined))