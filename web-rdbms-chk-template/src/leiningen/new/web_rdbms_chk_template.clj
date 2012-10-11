(ns leiningen.new.web-rdbms-chk-template
  (:use [leiningen.new.templates :only [renderer name-to-path ->files]]))

(def render (renderer "web-rdbms-chk-template"))

(defn web-rdbms-chk-template
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (->files data ["src/{{sanitized}}/core.clj" (render "core.clj" data)]
["project.clj" (render "project.clj" data)]
["src/{{sanitized}}/config.clj" (render "config.clj" data)]
["src/{{sanitized}}/view.clj" (render "view.clj" data)]
["src/{{sanitized}}/model.clj" (render "model.clj" data)]
["src/{{sanitized}}/bootstrap.clj" (render "bootstrap.clj" data)]
["resources/public/css/my.css" (render "my.css")]
["resources/public/js/my.js" (render "my.js")]
["log4j.xml" (render "log4j.xml")]
)))
