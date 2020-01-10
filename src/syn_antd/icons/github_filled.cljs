(ns syn-antd.icons.github-filled
  (:require
    [reagent.core]
    ["@ant-design/icons" :refer [GithubFilled]]))

(def github-filled (reagent.core/adapt-react-class GithubFilled))