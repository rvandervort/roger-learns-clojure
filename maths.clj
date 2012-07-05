(defn mean [v] (float (/ (reduce + v) (count v) ) ) )

(defn stdev [value-list]
  (def mean-val (mean value-list))
  (Math/sqrt 
    (/
      (reduce + 
        (map (fn [v] (* v v))
          (map (fn [val] (- val mean-val)) value-list)
        )
      )
      (count value-list)
    ) 
  )
)

; 2.0879116360612584
(println (stdev [2 4 5 6 9 8 7 6]))
