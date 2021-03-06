(defproject {{ns-name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [ring "1.1.6"]
                 [net.cgrand/moustache "1.1.0"]
                 [tvachon/enlive "1.0.2"]
                 [cheshire "2.0.4"]
                 [ring-json-params "0.1.3"]]
  :profiles {:dev {:plugins [[lein-ring "0.7.1"]]
                    :ring {:handler {{ns-name}}.core/web-app}}})
