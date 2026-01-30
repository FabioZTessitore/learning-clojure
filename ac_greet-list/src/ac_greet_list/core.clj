(ns ac-greet-list.core
  (:gen-class))

(defn greet-list
  "Greet a person with their name in a list."
  [name]
  (list "Hello, " name "!"))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (greet-list "World")))
