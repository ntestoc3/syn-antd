(ns syn-antd.icons.project-filled
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/ProjectFilled" :default ProjectFilled]))

(def project-filled (reagent.core/adapt-react-class ProjectFilled))