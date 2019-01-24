(ns demo.core
  (:require [reagent.core :as reagent]
            [demo.views :as views]))

(defn -main []
  (reagent/render [views/my-view]
                  (.querySelector js/document "#app")))

(def interval (js/setInterval -main 500))
