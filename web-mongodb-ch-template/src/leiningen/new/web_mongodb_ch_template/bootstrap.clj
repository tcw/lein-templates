(ns {{ns-name}}.bootstrap
  (:require [monger.core :as mg]
            [monger.collection :as mc]))

(defn test-data []
  (mg/set-db! (mg/get-db "monger-test-db-bootstrap"))
  ;(mc/remove "document")
  (mc/insert-batch "document" [{:firstname "John" :lastname "Lennon"}
                               {:firstname "Paul" :lastname "McCartney"}]))
