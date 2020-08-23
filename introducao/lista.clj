;; crindo uma lista em Clojure 
(list 1 2 3 4 5)
;; podemos criar assi, tbm

'(1 2 3 4 5) 
; Por que o apóstrofo na construção da lista? 
 
;Lembre-se de que a primeira coisa que vem depois de um 
;parêntese ( é normalmente uma função. E esta é uma característica de lingua- 
;gens baseadas em Lisp, onde tudo é uma lista, inclusive quando aplicamos uma 
;função. Sem o apóstrofo, a interpretação seria de que 1 seria compreendido 
;como uma função, e seria aplicada aos demais argumentos. Com o apóstrofo, 
;instruímos que a lista seja interpretada como uma simples lista, sem execução de função alguma.

; def declara uma variavel
; sintaxe (def nome-variavel valor)
(def um-ate-5 '(1 2 3 4 5))
(def um-ate-15 (range 1 16))
(count um-ate-5) ;; 5
(count um-ate-15) ;; 15
; O def nos permite dar um nome a alguma coisa e esta coisa pode, então, ser refer- 
;enciada mais adiante. É como a declaração de variáveis em outras linguagens, 
;como o uso de const em JavaScript. E aí podemos passar o valor referenciado 
;com def para uma função, como fizemos ao aplicar a função count em (count 
;um-ate-5), que nos diz quantos elementos há em uma lista. E como estamos li- 
;dando com uma sequência de números, podemos usar mais uma função nativa 
;para nos ajudar a criar a lista:


;; Aplicando fizzbuzz em lista com map

(defn divisivel-por? [dividendo divisor]
    (zero? (mod dividendo divisor)))
(defn fizzbuzz [numero]
    (cond (and (divisivel-por? numero 3) (divisivel-por? numero 5)) "fizzbuzz"
        (divisivel-por? numero 3) "fizz"
        (divisivel-por? numero 5) "buzz"
        :else numero))
;(map funcao-para-iterar lista-alvo) 
(map fizzbuzz um-ate-15)
;; listas também podem conter elementos de tipos variados 
(def cantora-arretada 
    (list "Renata Arruda" "João Pessoa" 23 "dezembro" 1967))

(nth cantora-arretada 0) ;; "Renata Arruda" 
(nth cantora-arretada 4) ;; 1967    
(last cantora-arretada) ;; 1967 
(first cantora-arretada) ;; "Renata Arruda"