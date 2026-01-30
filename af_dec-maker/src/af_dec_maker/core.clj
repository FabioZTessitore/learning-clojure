(ns af-dec-maker.core
  (:gen-class))

(defn dec-maker
  "I am a decrementer"
  [x]
  #(- % x))

(def dec9 (dec-maker 9))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (dec9 10)))
