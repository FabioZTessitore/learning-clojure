(ns aa-greet.core
  (:gen-class))

(defn greet
  "Returns a greeting for the given name."
  [name]
  (str "Hello, " name "!"))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
