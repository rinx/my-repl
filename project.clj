(defproject my-repl "0.1.0-SNAPSHOT"
  :description "my REPL"
  :url "https://github.com/rinx/my-repl"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.clojure/clojurescript "1.10.520"]
                 [org.clojure/spec.alpha "0.2.176"]
                 [org.clojure/test.check "0.10.0-alpha3"]
                 [org.clojure/core.async "0.4.490"]
                 [com.stuartsierra/component "0.4.0"]
                 [com.taoensso/timbre "4.10.0"]
                 [orchestra "2019.02.06-1"]
                 [clj-http "3.9.1"]
                 [metosin/jsonista "0.2.2"]
                 [camel-snake-kebab "0.4.0"]
                 [clj-gatling "0.13.0"]]
  :plugins [[lein-ancient "0.6.15"]]
  :profiles {:dev {:dependencies [[org.clojure/tools.namespace "0.2.11"]]
                   :source-paths ["dev"]}
             :uberjar {:aot :all
                       :main my-repl.core}})
