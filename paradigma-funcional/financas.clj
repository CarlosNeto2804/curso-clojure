
(def transacoes  [   
    {:valor 33.0 :tipo "despesa" :comentario "Almoço" :data "19/11/2016"} 
    {:valor 2700.0 :tipo "receita" :comentario "Bico" :data "01/12/2016"} 
    {:valor 29.0 :tipo "despesa" :comentario "Livro de Clojure" :data "03/12/2016"}])

(defn resumo [transacao]
    (select-keys transacao [:valor :tipo :data]))

(defn despesa? [transacao]
    (= (:tipo transacao) "despesa" ))

(defn busca-valor [transacao]
    (:valor transacao))
(def total-despesas 
    (reduce + 
        (map busca-valor 
            (filter despesa? transacoes))))
(println total-despesas)

;; Aplicando com funçoes anonimas
(def total-despesas2 
    (reduce + 
        (map (fn [transacao] (:valor transacao)) 
                (filter despesa? transacoes))))
(println total-despesas2)

;; Outra maneira funçoes anonimas
(def total-despesas3 
    (reduce + 
        (map #(:valor %)  
            (filter despesa? transacoes))))
(println total-despesas3)

; Aqui utilizamos a forma #(...) para encurtar a declaração da função anônima. 
; Perceba que agora não temos mais um argumento com o nome; antes tínhamos 
; um argumento chamado transacao, e agora ele não é mais tão explícito. Mesmo 
; assim, o argumento ainda existe. Lembre-se, filter vai passar por cada elemento da 
; coleção e passá-lo para a função que citamos como primeiro argumento. Daí, cada 
; elemento da coleção vira argumento da função anônima. Só que não precisamos 
; dar um nome a este argumento. Tanto faz. Por isso, podemos referenciá-lo com 
; %, como em (:valor %).

(def total-despesas4 
    (reduce + 
        (map #(:valor %)          
            (filter #(= (:tipo %) "despesa") transacoes))))
(println total-despesas4)


(println (busca-valor (first transacoes)))