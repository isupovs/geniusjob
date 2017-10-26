(ns geniusjob.core
  (:require
    [compojure.core :refer [GET defroutes]] 
    [ring.adapter.jetty :refer [run-jetty]]
    [ring.middleware.reload :refer [wrap-reload]]))

(defroutes app
  (GET "/" [] "Hello genius"))

(def reloadable-app 
  (wrap-reload #'app))

(defn -main [& args]
  (run-jetty reloadable-app {:port 3000}))
