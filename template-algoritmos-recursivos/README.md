# Identificação

* Nome: Staafany Nicole Santos Alves 
* Email (@ccc): 
* Matrícula: 

# Roteiro: Algoritmos Recursivos

## O template

> O código java estará (ou você terá que colocar) no diretório **/src/main/java/**

> javac AssertsComparacaoBusca.java ; java -ea AssertsComparacaoBusca

> Escreva testes para os seus programas! Siga o nosso padrão de ter uma classe chamada AssertsXXX.

> Não mude nenhuma assinatura de método, nome de classe ou localização dos arquivos. Mas você pode/deve criar outros métodos e classes, desde que passem nos testes.


## Introdução

Depois deste roteiro você será capaz de implementar alguns algoritmos recursivos clássicos e comparar o tempo de execução das versões recursivas e iterativas.

**O exemplo.** Vamos trabalhar com a busca binária, que vimos na aula teórica.  Veja em `/src/main/java` que eu já implementei a versão iterativa deste algoritmo e já preparei um `main` para logar a execução com os dados.

Neste roteiro nós vamos gerar um arquivo com arrays de diferentes tamanhos, executar algoritmos que operam sobre esses arrays e medir o tempo de execução para então fazermos a análise.

Agora é com vocês!

## A tarefa. 

### Implementação e testes

Comece gerando o arquivo que vai conter arrays de diferentes tamanhos. No diretório `scripts`, execute:

> python gera-arrays.py > ../data/input-arrays.data

Veja no diretório `data` que o arquivo `input-arrays.data` contém arrays de tamanhos 1000, 10000, 100000 e 1000000, que vamos usar para ver o desempenho dos nossos algoritmos buscando elementos neles. 

Agora execute a classe `Main` passando como entrada esses arrays. No diretório `src/main/java`, execute:

> java Main < ../../../data/input-arrays.data

Agora, **implemente a versão recursiva da busca binária**. Modifique o código para logar o tempo de execução da sua implementação também e redirecione a saída para um arquivos chamado `execution.data`, que deve conter os dados da versão recursiva e da versão iterativa.

> java Main < ../../../data/input-arrays.data > ../../../data/execution.data

Confira se o arquivo `execution.data` dentro do diretório `data` foi gerado corretamente.

Ah...confira (sempre!) se você passa nos testes: `gradle test`.

### Análise

Não vamos plotar gráfico dessa vez. Analise os dados presentes no arquivo `execution.data`.

Perguntas importantes:
  * No código, eu executei, para cada entrada, 30 rodadas e peguei a mediana do tempo de execução para representar o mesmo. Por que eu fiz isso?
    
  > Para eliminar qualquer interferências externas, como o hardware, e valores atípicos, e obter um resultado mais confiável.

  * Analise os dados de tempo de execução do algoritmo iterativo. O que você percebe sobre a relação entre o aumento da entrada e o aumento do tempo de execução?

  > É possível perceber que no iterativo os valores do tempo de execução crescem de forma mais lenta que o tamanho da entrada aumenta.
    
  * Analise os dados de tempo de execução do algoritmo recursivo. O que você percebe sobre a relação entre o aumento da entrada e o aumento do tempo de execução?
   
  > É possível perceber que no recursivo os valores do tempo de execução mantem-se constantes conforme a entrada aumenta.
  
  * Na teoria, os algoritmos tem a mesma eficiência assintótica?
   
   > Em teoria, ambos possuem a mesma eficiência O(log n), pois realizam a busca binária reduzindo o espaço de busca pela metade a cada passo.
  
  * Na prática, qual é mais veloz? Por que você acha que isso acontece?
   
   > Na prática, o iterativo tende a ser mais veloz por evitar o custo adicional das chamadas recursivas. No entanto, nos dados observados, as diferenças são pequenas e influenciadas por fatores externos.
  
  * Na teoria, qual a classe de complexidade dos dois algoritmos? O que isso significa?

   > Ambos são da classe O(log n), pois a cada execução reduzem o espaço de busca pela metade.

  * Esses são algoritmos eficientes de busca? Por que?
   
   > Por eles serem O(log n), reduzindo o espaço de busca pela metade a cada execução, se tornam mais eficientes para entradas maiores que o algoritmo de busca normal que são O(n).

## Mais estudo

Implemente as seguintes questões (com recursividade) no tst-eda:
* Busca Linear Recursiva
* Fibonacci
* Encontra primeiro negativo
* Encontra quebra recursivo
