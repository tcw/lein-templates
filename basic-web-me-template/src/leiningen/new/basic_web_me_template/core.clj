(ns {{sanitized}}.core
  (:use net.cgrand.moustache
        ring.middleware.file-info
        ring.middleware.resource
        ring.middleware.json-params)
  (:require [ring.util.response :as respond]
            [{{sanitized}}.view :as view]))

(def web-app
  (app
    (wrap-file-info)
    (wrap-resource "public")
    (wrap-json-params)

    [""] {:get (fn [req] (respond/response (view/index)))}
    [_] {:any (fn [req ](respond/not-found "Sorry nothing here!"))}))