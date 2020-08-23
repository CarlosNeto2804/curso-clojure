; comentário
; operações aritimericas são feitas com o padrão (operador valor-a valor-b)
(println (+ 2 3))
(println (- 2 3))
(println (* 2 3))
(println (/ 30 3))

; verificando se um numero é par
(println (even? 2))
(println (even? 3))

; se é multiplo de 3
(println (= 0 (mod 9 3)))
(println (= 0 (mod 4 3)))

;Condicionais
(println 
    (if (even? 2)
        "é par" ;caso seja verdadeiro
        "não é par"));else

; Funções
; defn -> declara uma função
; sintaxe: (defn nome-funcao "Descrição opcional da funçao" [parametros] corpo)
(defn divide? [dividendo divisor]
    (zero? (mod dividendo divisor)))

(println (divide? 2 6))
(println (divide? 3 9))


(defn saldo [valor]
    (cond (< valor 0 ) "negativo"
        (> valor 0) "positivo"
        :else "zero"))

(println ( saldo 0))
(println ( saldo 3))
(println ( saldo -4))