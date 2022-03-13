(ns reagent-reframe-notes.prod
  (:require [reagent-reframe-notes.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
