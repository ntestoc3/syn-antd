(ns syn-antd.icons.calendar-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/CalendarOutlined" :default CalendarOutlined]))

(def calendar-outlined (reagent.core/adapt-react-class CalendarOutlined))