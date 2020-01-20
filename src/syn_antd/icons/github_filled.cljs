(ns syn-antd.icons.github-filled
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/GithubFilled" :default GithubFilled]))

(def github-filled (reagent.core/adapt-react-class GithubFilled))