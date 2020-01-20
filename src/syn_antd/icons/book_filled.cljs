(ns syn-antd.icons.book-filled
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/BookFilled" :default BookFilled]))

(def book-filled (reagent.core/adapt-react-class BookFilled))