(ns user
  (:require [shadow.cljs.devtools.api :as shadow]))

(defn release!
  []
  (require '[shadow.cljs.devtools.api :as shadow])
  (shadow/release :computer))

(comment (release!))
