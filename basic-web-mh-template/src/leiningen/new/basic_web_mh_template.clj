(ns leiningen.new.basic-web-mh-template
  (:use [leiningen.new.templates :only [renderer name-to-path sanitize-ns ->files]]))

(def render (renderer "basic-web-mh-template"))

(defn basic-web-mh-template
  [name]
  (let [data {:name name
	      :ns-name (sanitize-ns name)
              :sanitized (name-to-path name)}]
    (->files data ["project.clj" (render "project.clj" data)]
["src/{{sanitized}}/core.clj" (render "core.clj" data)]
["src/{{sanitized}}/view.clj" (render "view.clj" data)]
["resources/public/css/my.css" (render "my.css")]
["resources/public/js/my.js" (render "my.js")]
)))
