; Existem diferenças sutis entre ambas as estruturas de dados (vetor e lista), principalmente no 
; aspecto de desempenho. Os vetores são como os famosos arrays, começando da posição 0, e podem 
; guardar elementos de qualquer tipo, permitindo a busca dos elementos através do 
; índice. Vetores são eficientes para adicionar itens ao final, enquanto listas, para 
; adicionar itens no início. 
(vector 1 2 3 4 5)
;; ou
[1 2 3 4 5]

(def numeros-vetorizados [1 2 3 4 5])

(def cantor-arretado (vector "Chico César" "Catolé do Rocha" 26 "janeiro" 1964))

(println (get cantor-arretado 0)) ; "Chico César" 
(println (get cantor-arretado 4)) ; 1964
(println (last cantor-arretado)) ; 1964
