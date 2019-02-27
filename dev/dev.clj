(ns dev
  (:require
    [clojure.java.io :as io]
    [clojure.pprint :refer [pprint]]
    [clojure.tools.namespace.repl :as repl :refer [refresh refresh-all]]
    [clojure.spec.alpha :as spec]
    [orchestra.spec.test :as stest]
    [clojure.core.async :as async :refer [<! >! <!! >!!]]
    [com.stuartsierra.component :as component]
    [taoensso.timbre :as timbre]
    [clj-http.client :as http]
    [cheshire.core :as cheshire]
    [camel-snake-kebab.core :as camel-snake-kebab]
    [my-repl.core :as core]))

(stest/instrument)
(timbre/set-level! :debug)

(defn reset []
  (refresh))
