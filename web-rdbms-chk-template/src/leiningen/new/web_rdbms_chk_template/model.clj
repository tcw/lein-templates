(ns {{sanitized}}.model
  (:use korma.core
        korma.db
        korma.config)
  (:require [{{sanitized}}.config :as conf]))

(defdb korma-db conf/h2-mem-spec)

(defentity books)

(defn get-all-books []
  (select books (fields :ranking :year :title :author)))

