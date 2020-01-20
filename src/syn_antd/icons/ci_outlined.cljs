(ns syn-antd.icons.ci-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/CiOutlined" :default CiOutlined]))

(def ci-outlined (reagent.core/adapt-react-class CiOutlined))