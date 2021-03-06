(ns reagent-reframe-notes.router.routes
  (:require
   [reitit.frontend :as reitit]))

(def router
  (reitit/router
   [["/" :routes/index]
    ["/notes"
     ["/" :routes/notes]
     ["/rendering" :routes/rendering]
     ["/items"
      ["/:item-id" :routes/item]]]
    ["/about" :routes/about]])) 

(defn path-for [route-name & [params]]
  (if params
    (:path (reitit/match-by-name router route-name params))
    (:path (reitit/match-by-name router route-name))))
