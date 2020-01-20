(ns syn-antd.icons.book-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/BookOutlined" :default BookOutlined]))

(def book-outlined (reagent.core/adapt-react-class BookOutlined))