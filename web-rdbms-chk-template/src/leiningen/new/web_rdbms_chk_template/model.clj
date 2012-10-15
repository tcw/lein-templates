(ns {{ns-name}}.model
  (:use korma.core
        korma.db
        korma.config)
  (:require [{{ns-name}}.config :as conf]))

(defdb korma-db conf/h2-mem-spec)

(defentity books)

(defn get-all-books []
  (select books (fields :ranking :year :title :author)))

