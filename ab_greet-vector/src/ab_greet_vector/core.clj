(ns ab-greet-vector.core
  (:gen-class))

(defn greet-vector
  "Greet a person with their name in a vector."
  [name]
  (vector "Hello," name "!"))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (greet-vector "World")))
