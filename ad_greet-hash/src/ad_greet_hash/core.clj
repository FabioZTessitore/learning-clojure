(ns ad-greet-hash.core
  (:gen-class))

(defn greet-hash
  "Greet a person with their name in a hash."
  [name]
  (hash-map :greeting "Hello" :name name))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (greet-hash "World")))
