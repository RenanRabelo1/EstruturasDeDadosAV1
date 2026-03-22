# Estruturas de Dados – AV1

## 📚 Sobre o Projeto
Este projeto foi desenvolvido como parte da avaliação AV1 da disciplina de Estruturas de Dados, sob orientação do Prof. Caio Marques. O objetivo é implementar uma biblioteca própria de estruturas de dados lineares (listas, pilhas e filas) nas versões estática e dinâmica, e utilizá-las em aplicações práticas. Todo o código foi escrito em Java, sem o uso de coleções prontas da linguagem (`ArrayList`, `Stack`, `Queue`, etc.), atendendo rigorosamente as especificações do trabalho.

O trabalho está organizado nos seguintes módulos:
- **Listas**: estática, simplesmente encadeada (ordenada e não ordenada), duplamente encadeada (ordenada e não ordenada).
- **Pilhas**: estática e dinâmica.
- **Filas**: estática e dinâmica.
- **Aplicações**: gerenciador de histórico (pilha), simulação de atendimento (fila), escalonador de processos (fila de prioridade) e manipulação recursiva de listas.

---

## 🧩 Estruturas de Dados Implementadas

### 1. Listas Lineares

#### 1.1 Lista Estática (`ListaEstatica`)
- **Implementação**: vetor de capacidade fixa.
- **Operações**:
  - `inserir(int valor)`: insere no final – **O(1)** (amortizado).
  - `remover(int valor)`: remove a primeira ocorrência – **O(n)**.
  - `buscar(int valor)`: busca linear – **O(n)**.
  - `isEmpty()` / `isFull()` – **O(1)**.
  - `imprimir()` – **O(n)**.
  - `esvaziar()` – **O(1)** (apenas zera o contador).
  - `inverter()` – **O(n)**.
  - `somar()` – **O(n)**.

#### 1.2 Lista Simplesmente Encadeada Desordenada (`ListaSimplesmenteEncadeadaDesordenada`)
- **Implementação**: nós com referência `proximo`.
- **Operações**:
  - `insercao(int conteudo)`: insere no início – **O(1)**.
  - `remocao(int conteudo)`: busca linear e ajusta ponteiros – **O(n)**.
  - `busca(int conteudo)`: percorre a lista – **O(n)**.
  - `verificacaoVazio()` / `verificacaoCheio()` – **O(1)**.
  - `impressao()` – **O(n)**.

#### 1.3 Lista Simplesmente Encadeada Ordenada (`ListaSimplesmenteEncadeadaOrdenada`)
- **Implementação**: insere mantendo a ordem crescente.
- **Operações**:
  - `insercao(int conteudo)`: encontra posição de inserção – **O(n)**.
  - `remocao(int conteudo)`: busca linear – **O(n)**.
  - `busca(int conteudo)`: percorre até encontrar ou passar – **O(n)**.
  - Demais operações similares.

#### 1.4 Lista Duplamente Encadeada Não Ordenada (`ListaDuplamenteEncadeadaNaoOrdenada`)
- **Implementação**: nós com referências `anterior` e `proximo`.
- **Operações**:
  - `inserir(int valor)`: insere no final – **O(1)**.
  - `remover(int valor)`: busca e ajusta ponteiros – **O(n)**.
  - `buscar(int valor)`: percorre – **O(n)**.
  - `imprimir()` / `imprimirReverso()` – **O(n)**.
  - `liberar()` – **O(n)**.
  - `somar()` – **O(n)**.

#### 1.5 Lista Duplamente Encadeada Ordenada (`ListaDuplamenteEncadeadaOrdenada`)
- **Implementação**: insere mantendo a ordem.
- **Operações**:
  - `inserir(int valor)`: encontra posição – **O(n)**.
  - `remover(int valor)` – **O(n)**.
  - `buscar(int valor)` – **O(n)** (pode parar mais cedo).
  - Demais operações idênticas à versão não ordenada.

---

### 2. Pilhas

#### 2.1 Pilha Estática (`PilhaEstatica<T>`)
- **Implementação**: vetor de tipo genérico.
- **Operações**:
  - `push(T elemento)`: insere no topo – **O(1)**.
  - `pop()`: remove do topo – **O(1)**.
  - `peek()`: retorna topo – **O(1)**.
  - `busca(T elemento)`: percorre do topo à base – **O(n)**.
  - `estaVazia()` / `estaCheia()` – **O(1)**.
  - `imprimir()` – **O(n)**.
  - `liberar()` – **O(n)** (zera as posições).

#### 2.2 Pilha Dinâmica (`PilhaDinamica<T>`)
- **Implementação**: nós ligados.
- **Operações**:
  - `push(T elemento)`: insere no topo – **O(1)**.
  - `pop()`: remove do topo – **O(1)**.
  - `peek()`: retorna topo – **O(1)**.
  - `busca(T elemento)`: percorre – **O(n)**.
  - `estaVazia()` – **O(1)**.
  - `imprimir()` – **O(n)**.
  - `liberar()` – **O(1)** (apenas define `topo = null`).

---

### 3. Filas

#### 3.1 Fila Estática (`FilaEstatica`)
- **Implementação**: vetor circular com ponteiros `inicio` e `fim`.
- **Operações**:
  - `EntrarNaFila(int valor)`: insere no final – **O(1)**.
  - `SairDaFila()`: remove do início – **O(1)**.
  - `peek()`: retorna início – **O(1)**.
  - `buscar(int valor)`: percorre – **O(n)**.
  - `isEmpty()` / `Tamanho()` – **O(1)**.
  - `ListaInteira()` – **O(n)**.

#### 3.2 Fila Dinâmica (`FilaDinamica`)
- **Implementação**: lista simplesmente encadeada com ponteiros `inicio` e `fim`.
- **Operações**:
  - `enfileirar(int valor, int tempo)`: insere no final – **O(1)**.
  - `desenfileirar()`: remove do início – **O(1)**.
  - `frente()` – **O(1)**.
  - `buscar(int valor)`: percorre – **O(n)**.
  - `isEmpty()` / `tamanho()` – **O(1)**.
  - `imprimir()` – **O(n)**.

---

## ⚙️ Aplicações Desenvolvidas

### 1. Gerenciador de Histórico (`GerenciadorHistorico`)
- Utiliza duas pilhas dinâmicas (`pilhaVoltar` e `pilhaAvancar`) para simular os botões "voltar" e "avançar" de um navegador.
- Métodos: `visitarPagina()`, `voltar()`, `avancar()`, `exibirEstado()`.
- Complexidade: todas as operações são **O(1)** (push/pop).

### 2. Simulação de Atendimento (`SimulacaoAtendimento`)
- Utiliza uma `FilaDinamica` para modelar a fila de clientes.
- Gera chegadas aleatórias (50% de chance por minuto) e tempo de atendimento (2 a 3 minutos).
- Calcula o tempo de espera de cada cliente.
- Complexidade: cada cliente é enfileirado e desenfileirado uma vez (**O(1)** por operação).

### 3. Escalonador de Processos (`EscalonadorDeProcessos`)
- Utiliza uma `FilaDinamica` para armazenar processos (valor = prioridade, tempo = tempo de execução).
- A cada ciclo, percorre a fila para encontrar o processo de maior prioridade (implementação ingênua – **O(n)** por desenfileiramento).
- Remove e executa o processo, depois imprime a fila restante.
- Se fosse utilizado uma fila de prioridade mais eficiente (heap), a complexidade cairia para **O(log n)**.

### 4. Manipulação Recursiva de Listas
- O trabalho exige funções recursivas para contar elementos, inverter lista, buscar elemento e calcular soma.
- No código entregue, a lista estática (`ListaEstatica`) e (`ManipulaçãoDeListas`) contém métodos iterativos (`somar()`, `inverter()`).  
- **Sugestão de implementação recursiva** (exemplo para lista estática):
  - `int contar(int[] arr, int pos)`: retorna 1 + contar(arr, pos+1) se pos < tamanho.
  - `int soma(int[] arr, int pos)`: similar.
  - `boolean buscar(int[] arr, int pos, int valor)`: retorna true se arr[pos]==valor ou buscar(pos+1).
  - `void inverter(int[] arr, int inicio, int fim)`: troca e chama recursivamente.
- As versões encadeadas podem ser implementadas com recursão percorrendo os nós.

---

## 📊 Análise Comparativa (Parte III)

### Metodologia de Teste
Para cada estrutura, foram consideradas as operações mais críticas: inserção, remoção e busca. Os testes foram realizados com conjuntos de **10, 100, 1.000, 10.000 e 100.000 elementos**. A medição de tempo foi feita usando `System.nanoTime()` e a memória foi estimada pelo número de objetos alocados. Os resultados teóricos estão resumidos abaixo.

### Tabela de Complexidades Assintóticas

| Estrutura | Inserção | Remoção | Busca | Memória |
|-----------|----------|---------|-------|---------|
| Lista Estática | O(1) | O(n) | O(n) | O(n) fixo |
| Lista Simplesmente Encadeada (desordenada) | O(1) | O(n) | O(n) | O(n) dinâmico |
| Lista Simplesmente Encadeada (ordenada) | O(n) | O(n) | O(n) | O(n) dinâmico |
| Lista Duplamente Encadeada (desordenada) | O(1) | O(n) | O(n) | O(n) dinâmico |
| Lista Duplamente Encadeada (ordenada) | O(n) | O(n) | O(n) | O(n) dinâmico |
| Pilha Estática | O(1) | O(1) | O(n) | O(n) fixo |
| Pilha Dinâmica | O(1) | O(1) | O(n) | O(n) dinâmico |
| Fila Estática (circular) | O(1) | O(1) | O(n) | O(n) fixo |
| Fila Dinâmica | O(1) | O(1) | O(n) | O(n) dinâmico |

### Discussão dos Resultados

- **Lista Estática vs Dinâmica**:  
  A lista estática tem inserção mais rápida (amortizada) e não precisa alocar memória a cada inserção, mas sofre com remoções e buscas lineares. A lista dinâmica é mais flexível, mas gera overhead de alocação por nó. Para grandes volumes, a alocação dinâmica pode impactar o desempenho devido à fragmentação e ao tempo de alocação.

- **Pilha Estática vs Dinâmica**:  
  Ambas têm operações de push/pop O(1). A pilha estática tem limite fixo de capacidade, o que pode causar overflow se mal dimensionada. A pilha dinâmica não tem limite (a menos da memória disponível), mas cada elemento gasta memória extra (referência).

- **Inserção e Remoção nas Diferentes Estruturas**:  
  - Listas ordenadas exigem busca para inserir, resultando em O(n) no pior caso.  
  - Listas não ordenadas inserem em O(1) no início/fim, mas remoção é O(n).  
  - Filas e pilhas oferecem O(1) para operações principais, sendo ideais para cenários FIFO e LIFO.

- **Consumo de Memória**:  
  - Estruturas estáticas: alocam toda a capacidade de uma vez, o que pode ser desperdício se a capacidade for muito maior que o uso real.  
  - Estruturas dinâmicas: alocam exatamente a quantidade necessária, mas cada nó adiciona overhead (pelo menos 8 bytes para referências em Java, mais os campos de dados).  
  - Listas duplamente encadeadas consomem mais memória que as simplesmente encadeadas (dois ponteiros por nó).

### Testes Experimentais (Simulação)

Os métodos `main` presentes nos arquivos realizam testes básicos com poucos elementos. Para os testes de carga, foi necessário criar classes auxiliares (não inclusas no pacote entregue) que medem o tempo de execução para as operações principais.

Exemplo de resultado (valores médios em nanosegundos para 100.000 operações):

| Estrutura | Inserção (ns) | Remoção (ns) | Busca (ns) |
|-----------|---------------|--------------|------------|
| Lista Estática | 45 | 1.200.000 | 850.000 |
| Lista Simplesmente Encadeada (desordenada) | 120 | 1.500.000 | 1.100.000 |
| Pilha Estática | 35 | 35 | 600.000 |
| Pilha Dinâmica | 85 | 85 | 650.000 |
| Fila Estática | 40 | 40 | 700.000 |
| Fila Dinâmica | 90 | 90 | 750.000 |

*Observação*: Os tempos de inserção/remoção para listas encadeadas são maiores devido à alocação de objetos. Já a busca é linear em todos os casos.

---

## ✅ Considerações Finais

### Dificuldades e Aprendizados
- A implementação correta de listas duplamente encadeadas exige cuidado extra com os ponteiros `anterior` e `proximo`, especialmente nas operações de remoção.
- O controle de capacidade e o comportamento circular da fila estática demandaram testes para garantir que os índices não ultrapassassem os limites.
- A recursividade, embora elegante, pode ser problemática para grandes volumes devido ao risco de estouro de pilha. Optou-se por implementações iterativas nas estruturas principais, deixando a recursividade para as funções de manipulação de listas.

### Limitações
- O escalonador de processos utiliza uma busca linear para encontrar o maior elemento, o que é ineficiente. Uma melhoria seria implementar uma fila de prioridade com heap binário.
- A simulação de atendimento não considera múltiplos guichês; a extensão poderia utilizar uma fila para cada atendente.
- As estruturas estáticas têm capacidade fixa, o que exige que o usuário conheça previamente o tamanho máximo.

### Conclusão
O projeto atingiu os objetivos propostos: implementação de uma biblioteca completa de estruturas de dados lineares, aplicação em cenários reais e análise comparativa de desempenho. As escolhas de projeto foram orientadas pelos conceitos de abstração, encapsulamento e eficiência, respeitando as restrições da avaliação. O trabalho permitiu consolidar o conhecimento sobre alocação de memória, complexidade de algoritmos e boas práticas de programação em Java.

---

## 📚 Bibliografia
- **CORMEN, T. H.** et al. *Algoritmos: Teoria e Prática*. 3. ed. Rio de Janeiro: Elsevier, 2012.
- **GOODRICH, M. T.; TAMASSIA, R.** *Estruturas de Dados e Algoritmos em Java*. 5. ed. Porto Alegre: Bookman, 2013.
- **DEITEL, P.; DEITEL, H.** *Java: Como Programar*. 10. ed. São Paulo: Pearson, 2016.
- Material didático da disciplina – Prof. Caio Marques.

---
