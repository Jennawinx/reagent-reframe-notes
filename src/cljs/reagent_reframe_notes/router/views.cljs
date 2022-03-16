(ns reagent-reframe-notes.router.views
  (:require
    ;; Pages
   [reagent-reframe-notes.pages.notes.notes :as notes]
   [reagent-reframe-notes.pages.notes.rendering :as notes-rendering]
   [reagent-reframe-notes.pages.suggestions.suggestions :as suggestions]
   [reagent-reframe-notes.pages.home.home :as home]))

;; Views are placed here to avoid circular dependencies

(def views 
  {:routes/index     #'home/home-page
   :routes/notes     #'notes/notes-page
   :routes/rendering #'notes-rendering/rendering-page
   :routes/item      #'notes/item-page})

(defn view-for [route-name]
  (get views route-name))
