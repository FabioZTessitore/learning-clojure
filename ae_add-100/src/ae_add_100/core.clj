(ns ae-add-100.core
  (:gen-class))

(defn add-100
  "Adds 100 to the given number."
  [n]
  (+ n 100))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (add-100 50)))
