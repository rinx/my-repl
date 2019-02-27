(ns user
  (:require
    [clojure.tools.namespace.repl :as repl
     :refer [refresh refresh-all]]
    [cljs.repl :as cljsrepl]
    [cljs.repl.node :as node]))

(repl/set-refresh-dirs "src" "test" "dev")

(defn dev []
  (require 'dev)
  (in-ns 'dev)
  :ok)

(defn noderepl []
  (cljsrepl/repl (node/repl-env)))

