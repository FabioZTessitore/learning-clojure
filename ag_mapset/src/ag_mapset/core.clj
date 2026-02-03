(ns ag-mapset.core
  (:gen-class))

(defn mapset
  "I am a mapset"
  [f aList]
  (if (empty? aList)
    #{}
    (conj (mapset f (rest aList)) (f (first aList)))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (mapset inc [1 1 2 2])))
