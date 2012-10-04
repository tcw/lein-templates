(ns {{sanitized}}.view
  (:require [hiccup.core :as h]
            [hiccup.page :as ph]
            [hiccup.element :as elem])
  (:use hiccup.def))

(defn common [page]
  (ph/html5
    [:head [:meta {:charset "utf-8"}]
     [:meta {:http-equiv "X-UA-Compatible" :content "IE=edge,chrome=1"}]
     [:meta {:name "viewport" :content "width=device-width, initial-scale=1, maximum-scale=1"}]
     [:title "Ring clojure basic template"]
     (ph/include-css "/css/my.css")]
    [:body  (page :page/content )]
    (ph/include-js "/js/my.js")))

(defn index []
  (common {:page/content [:h1 "hello template"]}))




