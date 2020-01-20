(ns syn-antd.icons.slack-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/SlackOutlined" :default SlackOutlined]))

(def slack-outlined (reagent.core/adapt-react-class SlackOutlined))