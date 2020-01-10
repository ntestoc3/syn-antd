(ns syn-antd.icons.utils
  (:require
    [reagent.core]
    ["@ant-design/icons" :refer [utils]]))

(def utils (reagent.core/adapt-react-class utils))