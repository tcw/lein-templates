(ns {{ns-name}}.core
  (:use compojure.core
        stencil.core
        ring.middleware.json-params)
  (:require [compojure.route :as route]
            [compojure.handler :as handler]))

(defroutes main-routes
  (GET "/" [] (render-file "index" {:body "<h1>hello mustache</h1>"}))
  (route/resources "/")
  (route/not-found "Page not found"))

(def app
  (-> main-routes
    handler/site
    (wrap-json-params)))
