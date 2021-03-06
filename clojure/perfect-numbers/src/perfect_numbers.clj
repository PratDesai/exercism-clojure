(ns perfect-numbers)

(defn factors [n]
  (filter #(zero? (mod n %)) (range 1 (inc (/ n 2)))))

(defn classify [n]
  (if (neg? n)
    (throw (IllegalArgumentException.))
    (let [sum (apply + (factors n))]
      (cond (= sum n) :perfect
            (< sum n) :deficient
            :else :abundant))))