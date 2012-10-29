(ns {{ns-name}}.model
  (:require [monger.core :as mg]
            [monger.collection :as mc]))

(mg/connect!)

(defn all-documents []
  (mc/find-maps "document"))