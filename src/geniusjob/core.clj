(ns geniusjob.core
  (:require
    [hiccup.core :refer [html]]
    [geniusjob.layout :refer [layout]]
    [compojure.core :refer [GET defroutes]] 
    [ring.adapter.jetty :refer [run-jetty]]
    [ring.middleware.reload :refer [wrap-reload]]))

(defroutes app
  (GET "/" [] (html (layout 1 2 "A lot of cool stuff will be there soon! (I hope)"))))

(def reloadable-app 
  (wrap-reload #'app))

(defn -main [& args]
  (run-jetty reloadable-app {:port 3000}))
