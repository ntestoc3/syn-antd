(ns syn-antd.icons.bug-filled
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/BugFilled" :default BugFilled]))

(def bug-filled (reagent.core/adapt-react-class BugFilled))