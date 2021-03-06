(defproject {{ns-name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [ring "1.1.0"]
                 [compojure "1.1.0"]
                 [hiccup "1.0.0"]
                 [cheshire "2.0.4"]
                 [korma "0.3.0-beta9"]
                 [com.h2database/h2 "1.3.160"]
                 [ring-json-params "0.1.3"]
                 [log4j "1.2.15" :exclusions [javax.mail/mail
                                              javax.jms/jms
                                              com.sun.jdmk/jmxtools
                                              com.sun.jmx/jmxri]]]
  :profiles {:dev {:plugins [[lein-ring "0.7.1"]]
                    :ring {:handler {{ns-name}}.core/app
                           :init {{ns-name}}.bootstrap/create-test-data}}})
