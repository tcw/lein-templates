(ns {{ns-name}}.core
  (:use compojure.core
        ring.middleware.json-params)
  (:require [compojure.route :as route]
            [compojure.handler :as handler]
            [{{ns-name}}.view :as view]))

(defroutes main-routes
  (GET "/" [] (view/index))
  (route/resources "/")
  (route/not-found "Page not found"))

(def app
  (-> main-routes
    handler/site
    (wrap-json-params)))
