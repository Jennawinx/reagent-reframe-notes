(ns reagent-reframe-notes.router.views
  (:require
    ;; Pages
   [reagent-reframe-notes.pages.notes.notes :as notes]
   [reagent-reframe-notes.pages.suggestions.suggestions :as suggestions]
   [reagent-reframe-notes.pages.home.home :as home]))

;; Views are placed here to avoid circular dependencies

(def views 
  {:index #'home/home-page
   :items #'notes/notes-page
   :item  #'notes/item-page})

(defn view-for [route-name]
  (get views route-name))
