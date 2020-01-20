(ns syn-antd.icons.api-filled
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/ApiFilled" :default ApiFilled]))

(def api-filled (reagent.core/adapt-react-class ApiFilled))