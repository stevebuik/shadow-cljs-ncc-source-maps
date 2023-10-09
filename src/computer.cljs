(ns computer
  (:require ["lodash" :as lodash]))

(defn ask
  [& args]
  (let [now (.-now lodash)
        questions (set args)]

    (js/console.log "Asked at:" (now))
    
    (str "Response: "
         (cond
           (contains? questions "why?") "because we can"
           (contains? questions "how?") (throw (ex-info "don't know how" {}))
           :else "ask me something"))))
