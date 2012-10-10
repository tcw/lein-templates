(ns leiningen.new.basic-web-cs-template
  (:use [leiningen.new.templates :only [renderer name-to-path ->files]]))

(def render (renderer "basic-web-cs-template"))

(defn basic-web-cs-template
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (->files data ["project.clj" (render "project.clj" data)]
["src/{{sanitized}}/core.clj" (render "core.clj" data)]
["resources/public/js/my.js" (render "my.js")]
["resources/public/css/my.css" (render "my.css")]
["resources/index.mustache" (render "index.mustache")]
)))