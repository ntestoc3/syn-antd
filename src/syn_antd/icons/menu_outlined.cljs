(ns syn-antd.icons.menu-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/MenuOutlined" :default MenuOutlined]))

(def menu-outlined (reagent.core/adapt-react-class MenuOutlined))