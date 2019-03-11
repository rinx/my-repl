(ns dev
  (:require
    [clojure.java.io :as io]
    [clojure.pprint :refer [pprint]]
    [clojure.tools.namespace.repl :as repl :refer [refresh refresh-all]]
    [clojure.spec.alpha :as spec]
    [clojure.spec.gen.alpha :as gen]
    [orchestra.spec.test :as stest]
    [clojure.core.async :as async :refer [<! >! <!! >!!]]
    [clojure.data :as data]
    [clojure.edn :as edn]
    [clojure.set :as set]
    [clojure.string :as string]
    [clojure.walk :as walk]
    [clojure.xml :as xml]
    [clojure.zip :as zip]
    [com.stuartsierra.component :as component]
    [taoensso.timbre :as timbre]
    [clj-http.client :as http]
    [cheshire.core :as cheshire]
    [camel-snake-kebab.core :as camel-snake-kebab]
    [clj-gatling.core :as gatling]
    [my-repl.core :as core]))

(stest/instrument)
(timbre/set-level! :debug)

(defn reset []
  (refresh))
