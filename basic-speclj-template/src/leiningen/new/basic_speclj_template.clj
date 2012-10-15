(ns leiningen.new.basic-speclj-template
  (:use [leiningen.new.templates :only [renderer name-to-path sanitize-ns ->files]]))

(def render (renderer "basic-speclj-template"))

(defn basic-speclj-template
  [name]
  (let [data {:name name
	      :ns-name (sanitize-ns name)
              :sanitized (name-to-path name)}]
    (->files data ["src/{{sanitized}}/core.clj" (render "core.clj" data)]
["spec/{{sanitized}}/core_spec.clj" (render "core_spec.clj" data)]
["project.clj" (render "project.clj" data)]
)))
