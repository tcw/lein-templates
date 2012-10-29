(ns leiningen.new.web-mongodb-ch-template
  (:use [leiningen.new.templates :only [renderer name-to-path sanitize-ns ->files]]))

(def render (renderer "web-mongodb-ch-template"))

(defn web-mongodb-ch-template
  [name]
  (let [data {:name name
              :ns-name (sanitize-ns name)
              :sanitized (name-to-path name)}]
    (->files data ["src/{{sanitized}}/view.clj" (render "view.clj" data)]
["src/{{sanitized}}/model.clj" (render "model.clj" data)]
["src/{{sanitized}}/bootstrap.clj" (render "bootstrap.clj" data)]
["src/{{sanitized}}/core.clj" (render "core.clj" data)]
["project.clj" (render "project.clj" data)]
["resources/public/js/my.js" (render "my.js")]
["resources/public/css/my.css" (render "my.css")]
)))