(ns syn-antd.icons.docker-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/DockerOutlined" :default DockerOutlined]))

(def docker-outlined (reagent.core/adapt-react-class DockerOutlined))