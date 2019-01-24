(ns demo.views
  (:require [cljsjs.react-chartjs-2]
            [reagent.core :refer [adapt-react-class]]))

(def doughnut (adapt-react-class (.-Doughnut js/ReactChartjs2)))

(defn heading []
  [:div
   [:h1 "Title"]
   [:button {:on-click #(js/alert "Hey there")} "Hit me!"]])

(defn my-view []
  [:div
   [doughnut
    {:data {:datasets [{:data [50 100 200]
                        :backgroundColor [:green :red :yellow]}]
            :labels ["world" "hello"]}
     :height 50}]

   [heading]
   [:p "Hello"]
   [:h2 "Bye"]
   [:hr]
   [:p "Meetup"]
   ])
