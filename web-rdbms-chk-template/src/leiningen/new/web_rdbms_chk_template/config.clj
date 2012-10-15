(ns {{ns-name}}.config
  (:require [clojure.string :as string]))

(defonce h2-mem-spec
  {:classname "org.h2.Driver"
   :subprotocol "h2:mem:"
   :subname "tester;DB_CLOSE_DELAY=-1"
   :delimiters ""
   :naming {:keys string/lower-case
            :fields string/upper-case}})
