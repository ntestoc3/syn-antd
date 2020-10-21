(ns syn-antd.empty
  (:refer-clojure :exclude [empty])
  (:require
    [reagent.core]
    ["antd/es/empty" :default ant-empty]))

(def empty (reagent.core/adapt-react-class ant-empty))