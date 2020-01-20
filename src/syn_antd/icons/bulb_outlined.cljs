(ns syn-antd.icons.bulb-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/BulbOutlined" :default BulbOutlined]))

(def bulb-outlined (reagent.core/adapt-react-class BulbOutlined))