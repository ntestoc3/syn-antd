(ns syn-antd.icons.setting-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/SettingOutlined" :default SettingOutlined]))

(def setting-outlined (reagent.core/adapt-react-class SettingOutlined))