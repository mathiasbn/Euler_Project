(ns problem2.main)

;;Stolen fib gen :( (did the empty input myself!!
(defn fibList
  ([a b] (lazy-seq (cons a (fibList b (+ b a)))))
  ([] (fibList 1 2)))

(defn listFibsUpTo [n] (take-while (partial > n) (fibList) ))

(println (listFibsUpTo 4000000))
(println (reduce + (filter even? (listFibsUpTo 4000000))))
