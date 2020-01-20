(ns syn-antd.icons.team-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/TeamOutlined" :default TeamOutlined]))

(def team-outlined (reagent.core/adapt-react-class TeamOutlined))