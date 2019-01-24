(ns user
  (:require [cljs.repl.browser :as browser]
            cider.piggieback))

(def env (browser/repl-env))

(defn repl []
  (cider.piggieback/cljs-repl env :main "demo.core"))
