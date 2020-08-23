;criar uma função que retorne: 
;fizz, se o número for divisível por 3; 
;buzz, se divisível por 5; 
;fizzbuzz, se divisível por 3 e por 5; ou 
;o próprio número, caso contrário.

(defn divisivel-por? [dividendo divisor]
    (zero? (mod dividendo divisor)))
(defn fizzbuzz [numero]
    (cond (and (divisivel-por? numero 3) (divisivel-por? numero 5)) "fizzbuzz"
        (divisivel-por? numero 3) "fizz"
        (divisivel-por? numero 5) "buzz"
        :else numero))

(println (fizzbuzz 3)) ; fizz
(println (fizzbuzz 5)) ; buzz
(println (fizzbuzz 15)) ; fizzbuzz
(println (fizzbuzz 8)) ; 8