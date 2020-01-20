(ns syn-antd.icons.gitlab-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/GitlabOutlined" :default GitlabOutlined]))

(def gitlab-outlined (reagent.core/adapt-react-class GitlabOutlined))