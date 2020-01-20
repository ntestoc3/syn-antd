(ns syn-antd.icons.audit-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/AuditOutlined" :default AuditOutlined]))

(def audit-outlined (reagent.core/adapt-react-class AuditOutlined))