(ns reagent-reframe-notes.pages.home.home
  (:require
   [reagent-reframe-notes.router.routes :as routes]))

;; NOTE: Keep entry point as the bottom most function
(defn home-page []
  [:div
   [:span "Welcome to the experiment!"]
   [:span.main
    [:h1 "Welcome to reagent-reframe-notes"]
    [:ul [:li [:a {:href (routes/path-for :routes/notes)}
               "Items of reagent-reframe-notes"]]]]])
