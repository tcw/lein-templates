(ns leiningen.new.basic-web-ch-template
  (:use [leiningen.new.templates :only [renderer name-to-path sanitize-ns ->files]]))

(def render (renderer "basic-web-ch-template"))

(defn basic-web-ch-template
  [name]
  (let [data {:name name
	      :ns-name (sanitize-ns name)
              :sanitized (name-to-path name)}]
    (->files data ["src/{{sanitized}}/view.clj" (render "view.clj" data)]
["project.clj" (render "project.clj" data)]
["src/{{sanitized}}/core.clj" (render "core.clj" data)]
["resources/public/js/my.js" (render "my.js")]
["resources/public/css/my.css" (render "my.css")]
)))
