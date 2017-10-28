(ns geniusjob.layout)

(defn layout [head title content]
  [:html5 {:lang "en"}
    [:head]
    [:body
      [:div {:class "content"} content]]]
  )
