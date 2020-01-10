(ns syn-antd.icons.github-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons" :refer [GithubOutlined]]))

(def github-outlined (reagent.core/adapt-react-class GithubOutlined))