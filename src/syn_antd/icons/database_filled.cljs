(ns syn-antd.icons.database-filled
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/DatabaseFilled" :default DatabaseFilled]))

(def database-filled (reagent.core/adapt-react-class DatabaseFilled))