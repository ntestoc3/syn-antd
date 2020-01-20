(ns syn-antd.icons.github-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/GithubOutlined" :default GithubOutlined]))

(def github-outlined (reagent.core/adapt-react-class GithubOutlined))