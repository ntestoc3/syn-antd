(ns syn-antd.icons.search-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/SearchOutlined" :default SearchOutlined]))

(def search-outlined (reagent.core/adapt-react-class SearchOutlined))