(ns syn-antd.icons.project-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/ProjectOutlined" :default ProjectOutlined]))

(def project-outlined (reagent.core/adapt-react-class ProjectOutlined))