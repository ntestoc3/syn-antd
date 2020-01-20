(ns syn-antd.icons.ant-design-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/AntDesignOutlined" :default AntDesignOutlined]))

(def ant-design-outlined (reagent.core/adapt-react-class AntDesignOutlined))