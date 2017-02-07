(ns calc.model)

(defn add [x y]
  (+ x y))

(defn mult [x y]
  (* x y))

(defn div [x y]
  (/ x y))

(defn bmi [x]
  (cond
    (<= x 18.5) "저체중"
    (<= x 24.9) "정상"
    (<= x 29.9) "과체중"
    :else "비만")
)

