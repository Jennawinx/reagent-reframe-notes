(ns reagent-reframe-notes.pages.notes.notes
  (:require
   [reagent-reframe-notes.router.routes :as routes]
   [reagent.session :as session]))

(defn item-page []
  (let [routing-data (session/get :route)
        item         (get-in routing-data [:route-params :item-id])]
    [:span.main
     [:h1 (str "Item " item " of reagent-reframe-notes")]
     [:p [:a {:href (routes/path-for :routes/items)} "Back to the list of items"]]]))

;; NOTE: Keep entry point as the bottom most function
(defn notes-page []
  [:div "Booklet of notes"
   [:span.main
    [:h1 "Routing test"]
    [:ul
     (for [item-id (range 1 60)]
       ^{:key (str "item-" item-id)}
       [:li {:name (str "item-" item-id)}
        [:a {:href (routes/path-for :routes/item {:item-id item-id})}
         (str "Item: " item-id)]])]]])
