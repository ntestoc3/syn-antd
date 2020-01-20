(ns syn-antd.icons.calendar-filled
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/CalendarFilled" :default CalendarFilled]))

(def calendar-filled (reagent.core/adapt-react-class CalendarFilled))