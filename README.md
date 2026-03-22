# 📚 Sistema de Estruturas de Dados em Java (AV1 - Unifor)

## 📌 Descrição
Este projeto implementa diversas estruturas de dados fundamentais em Java, sem o uso de bibliotecas prontas (`java.util.*`), com o objetivo de demonstrar seu funcionamento interno e aplicações práticas. O projeto integra conceitos de alocação de memória, recursividade e encapsulamento, além de simular cenários reais como histórico de navegação, filas de banco e escalonamento de processos.

## 🧠 Estruturas de Dados Implementadas

### 🔹 Pilhas (Stacks)
* **PilhaEstatica**: Implementação baseada em vetores com tamanho fixo.
* **PilhaDinamica**: Implementação utilizando encadeamento de nós (alocação dinâmica).

**Funcionalidades:**
* `push` (inserção no topo)
* `pop` (remoção do topo)
* `peek` (consulta do elemento no topo)
* `busca` (localização de elementos)
* `liberar` (limpeza de memória)

### 🔹 Filas (Queues)
* **FilaEstatica**: Implementação circular em vetor para otimização de espaço.
* **FilaDinamica**: Implementação encadeada com suporte a tempo de atendimento.
* **Funcionalidades**: Inserção, remoção, consulta de frente, busca e impressão.

### 🔹 Listas
* **Lista Estática**: Inserção, remoção e busca em vetor.
* **Lista Simplesmente Encadeada**: Versões ordenada e não ordenada.
* **Lista Duplamente Encadeada**: Versões ordenada e não ordenada com ponteiros para anterior e próximo.

## 🚀 Simulações Implementadas

### 🌐 Gerenciador de Histórico de Navegador
* **Arquivo**: `GerenciadorHistorico.java`
* Simula as funções "Voltar" e "Avançar" de um navegador web utilizando duas pilhas dinâmicas para garantir eficiência $O(1)$.

### 🏥 Simulação de Atendimento (Fila de Banco)
* **Arquivo**: `SimulacaoAtendimento.java`
* Simula a chegada aleatória de clientes e tempos de atendimento variáveis, calculando o tempo de espera através de uma `FilaDinamica`.

### ⚙️ Escalonador de Processos
* **Arquivo**: `EscalonadorDeProcessos.java`
* Gerencia a execução de processos com base em prioridades e tempo de execução utilizando uma fila de prioridade.

### 🗼 Torre de Hanói (Recursividade)
* **Arquivo**: `Hanoi.java`
* Resolução matemática do quebra-cabeça clássico utilizando recursão pura para demonstrar a complexidade exponencial $O(2^n)$.

## ⚙️ Como executar o projeto

### 🔧 Pré-requisitos
* **Java JDK 8** ou superior instalado.
* Terminal (PowerShell, CMD ou Terminal do VS Code).

### ▶️ Passo a passo
1.  Abra o terminal na pasta `src` do projeto.
2.  Compile todos os arquivos:
    ```bash
    javac *.java
    ```
3.  Execute a aplicação desejada:
    ```bash
    java GerenciadorHistorico
    ```

## 🗂️ Estrutura do projeto
O projeto está organizado nos seguintes arquivos principais:
* `PilhaEstatica.java` / `PilhaDinamica.java`
* `FilaEstatica.java` / `FilaDinamica.java`
* `ListaEstatica.java` / `ListaSimplesmenteEncadeadaOrdenada.java` (e demais variações)
* `GerenciadorHistorico.java`
* `SimulacaoAtendimento.java`
* `Hanoi.java`
* `EscalonadorDeProcessos.java`

## 🧠 Conceitos Aplicados
* **LIFO (Last-In, First-Out)**: Para pilhas e histórico.
* **FIFO (First-In, First-Out)**: Para filas de atendimento.
* **Encapsulamento**: Atributos privados e métodos de acesso controlados.
* **Alocação Dinâmica**: Manipulação de nós e referências na memória RAM.

## 👨‍💻 Autores (Grupo)
* **Anderson Herculano** (Pilha e Histórico)
* **Renan Rabelo** (Fila e Atendimento)
* **Zíltom Machado** (Listas e Escalonador)
* **Caíque** (Recursão de Listas)