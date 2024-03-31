(ns mainside.finders-keepers.test-utils
  (:require
    [mainside.finders-keepers.core :as core]
    [integrant.repl.state :as state]))

(defn system-state 
  []
  (or @core/system state/system))

(defn system-fixture
  []
  (fn [f]
    (when (nil? (system-state))
      (core/start-app {:opts {:profile :test}}))
    (f)
    (core/stop-app)))
