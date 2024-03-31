(ns mainside.finders-keepers.env
  (:require
    [clojure.tools.logging :as log]
    [mainside.finders-keepers.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init       (fn []
                 (log/info "\n-=[finders-keepers starting using the development or test profile]=-"))
   :start      (fn []
                 (log/info "\n-=[finders-keepers started successfully using the development or test profile]=-"))
   :stop       (fn []
                 (log/info "\n-=[finders-keepers has shut down successfully]=-"))
   :middleware wrap-dev
   :opts       {:profile       :dev
                :persist-data? true}})
