(ns {{sanitized}}.view
  (:use net.cgrand.enlive-html))

(deftemplate t1 "index.html" [hdr] [:h1] (content hdr))

(defn index []
  (apply str (t1 "First Enlive App")))




