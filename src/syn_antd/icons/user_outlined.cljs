(ns syn-antd.icons.user-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons" :refer [UserOutlined]]))

(def user-outlined (reagent.core/adapt-react-class UserOutlined))