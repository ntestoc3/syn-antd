(ns syn-antd.icons.pull-request-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons" :refer [PullRequestOutlined]]))

(def pull-request-outlined (reagent.core/adapt-react-class PullRequestOutlined))