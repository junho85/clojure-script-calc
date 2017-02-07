(ns calc.view
  (:require [dommy.core :as dommy :refer-macros [sel1]]
            [calc.model :refer [add,mult,div,bmi]]))

(defn int-value [id]
  (js/parseInt (.-value (sel1 id))))

(defn float-value [id]
  (js/parseFloat (.-value (sel1 id))))

(defn calc []
  (dommy/set-value! (sel1 :#result) (add (int-value :#x) (int-value :#y))))

(defn calc2 []
  (dommy/set-value! (sel1 :#result2)
                    (div
                      (float-value :#weight)
                      (mult (float-value :#height) (float-value :#height))
                      ))
  (dommy/set-value! (sel1 :#result3)
                    (bmi (float-value :#result2))
                    )
  )

(def view
  [:div
   [:div]
     [:input#x]
     [:input#y]
     [:button {:on-click calc} "="]
     [:input#result]
   [:div
    "신장" [:input#height]
    "몸무게" [:input#weight]
    [:button {:on-click calc2} "="]
    [:input#result2]
    [:input#result3]
    ]]
)

