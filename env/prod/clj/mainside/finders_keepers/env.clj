(ns mainside.finders-keepers.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init       (fn []
                 (log/info "\n-=[finders-keepers starting]=-"))
   :start      (fn []
                 (log/info "\n-=[finders-keepers started successfully]=-"))
   :stop       (fn []
                 (log/info "\n-=[finders-keepers has shut down successfully]=-"))
   :middleware (fn [handler _] handler)
   :opts       {:profile :prod}})
