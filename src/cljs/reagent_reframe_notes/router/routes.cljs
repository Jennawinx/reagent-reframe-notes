(ns reagent-reframe-notes.router.routes
  (:require
   [reitit.frontend :as reitit]))

(def router
  (reitit/router
   [["/" :index]
    ["/items"
     ["/" :items]
     ["/:item-id" :item]]
    ["/about" :about]])) 

(defn path-for [route-name & [params]]
  (if params
    (:path (reitit/match-by-name router route-name params))
    (:path (reitit/match-by-name router route-name))))
