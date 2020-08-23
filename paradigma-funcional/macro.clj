(def transacoes  [   
    {:valor 33.0 :tipo "despesa" :comentario "Almoço" :data "19/11/2016"} 
    {:valor 2700.0 :tipo "receita" :comentario "Bico" :data "01/12/2016"} 
    {:valor 29.0 :tipo "despesa" :comentario "Livro de Clojure" :data "03/12/2016"}])

(defn busca-valor [transacao]
    (:valor transacao))

(defn despesa? [transacao]
    (= (:tipo transacao) "despesa" ))

(println (busca-valor (first transacoes))); busco :valor no primeiro mapa da coleçao

(println (-> (first transacoes) (busca-valor))); obtenho o primeiro valor da coleção e busco :valor

;Fica bem mais claro qual a ordem de execução. Esta macro se chama 
;thread-first. Apesar de ter thread no nome, não há nada de concorrência aqui. Mas 
;vale pensar em thread como um fluxo, e o first (de thread first) é importante porque 
;significa que o resultado de uma linha é usado como o primeiro argumento da
;função seguinte. É por isso que busca-valor aparenta não receber nenhum argumento, 
;quando, de fato, recebe o resultado da função anterior como seu primeiro argumento.

;Existe uma outra macro parecida: ->>, chamada de thread-last. Ela é útil nos casos 
;em que precisamos passar o resultado da aplicação de uma função como o último 
;argumento da função seguinte. Por exemplo:

(def resultado 
    (->> (filter despesa? transacoes) ; filtra despesas
    (map busca-valor) ; extrai o valor
    (reduce +))) ;executa reduce nos valores obtidos)
(println resultado)

;; sem macro 
(reduce + ;; executa reduce nos valores
    (map busca-valor ;; valores obtidos atraves de um map
    (filter despesa? transacoes))) ;; valores esses obtidos em um filtro 