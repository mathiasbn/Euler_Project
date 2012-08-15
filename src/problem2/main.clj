(ns problem2.main)

(def fibListGenerator (iterate (fn [n] (cons (+ (first n) (second n)) n)) [2 1]))
(def fibListOf (fn [n] (nth fibListGenerator (- n 2))))
(def fibNum (fn [n] (first (fibListOf n))))

(println (fibListOf 32))
(println (concat "fib nr 32 is less then 4 mill:" (str (< (fibNum 32) 4000000N))))

