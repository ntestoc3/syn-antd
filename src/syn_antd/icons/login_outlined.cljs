(ns syn-antd.icons.login-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/LoginOutlined" :default LoginOutlined]))

(def login-outlined (reagent.core/adapt-react-class LoginOutlined))