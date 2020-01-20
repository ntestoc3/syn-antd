(ns syn-antd.icons.gitlab-filled
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/GitlabFilled" :default GitlabFilled]))

(def gitlab-filled (reagent.core/adapt-react-class GitlabFilled))