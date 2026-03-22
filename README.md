# Estruturas de Dados – Implementações em Java

Este projeto contém implementações de diversas estruturas de dados lineares (listas, filas, pilhas) e aplicações de simulação (escalonador de processos, histórico de navegação, simulação de atendimento bancário). O código foi desenvolvido como parte da disciplina de Estruturas de Dados.

## 📁 Estrutura do Projeto

```text
src/
│ ├── ListaEstatica.java
│ ├── ListaSimplesmenteEncadeadaDesordenada.java
│ ├── ListaSimplesmenteEncadeadaOrdenada.java
│ ├── ListaDuplamenteEncadeadaNaoOrdenada.java
│ ├── ListaDuplamenteEncadeadaOrdenada.java
│ │── ManipulacaoDeListas.java
│ │
│ ├── PilhaEstatica.java
│ ├── PilhaDinamica.java
│ │── GerenciadorHistorico.java
│ │
│ ├── FilaEstatica.java
│ ├── FilaDinamica.java
│ ├── EscalonadorDeProcessos.java
│ └── SimulacaoAtendimento.java
```

## 🔧 Pré‑requisitos

* **Java Development Kit (JDK)** – versão 24 ou superior (recomendado)
* Terminal / Prompt de comando

> **Nota**: O código usa recursos do Java 24 (como `String` templates), mas é compatível com versões a partir do Java 21. Caso utilize uma versão inferior, algumas funcionalidades podem não estar disponíveis.

## ⚙️ Compilação

A partir da raiz do projeto, execute:

```bash
javac -d out src/**/*.java
```

Isso compilará todos os arquivos `.java` e colocará os arquivos `.class` no diretório `out/`.

## 🚀 Execução

Cada classe com método `main` pode ser executada separadamente. A tabela abaixo mostra o comando para rodar cada aplicação.

| Classe / Aplicação | Comando (a partir da raiz) |
| :--- | :--- |
| **Simulação de Atendimento** | `java -cp out SimulacaoAtendimento` |
| **Escalonador de Processos** | `java -cp out EscalonadorDeProcessos` |
| **Manipulação de Listas** (teste) | `java -cp out ManipulacaoDeListas` |
| **Histórico de Navegação** | `java -cp out aplicacoes.MainHistorico` |
| **Testes individuais** (ex.: FilaDinamica) | `java -cp out FilaDinamica` |

### 🔁 Exemplo de execução – Simulação de Atendimento
```bash
java -cp out SimulacaoAtendimento
```
*A simulação exibe minuto a minuto a chegada de clientes, o tempo de espera e o atendimento.*

### 🌐 Exemplo – Histórico de Navegação
```bash
java -cp out aplicacoes.MainHistorico
```
*Demonstra navegação entre páginas, botões “voltar” e “avançar” utilizando duas pilhas dinâmicas.*

---

## 📚 Funcionalidades das Estruturas

### 📦 Listas
* **ListaEstatica:** array com capacidade fixa, operações de inserção, remoção, busca, inversão, soma.
* **ListaSimplesmenteEncadeadaDesordenada:** inserção no início, remoção por valor.
* **ListaSimplesmenteEncadeadaOrdenada:** inserção mantendo a ordem crescente.
* **ListaDuplamenteEncadeadaNaoOrdenada:** inserção no final, remoção por valor, percurso reverso.
* **ListaDuplamenteEncadeadaOrdenada:** inserção ordenada, remoção, percurso reverso.

### 🧵 Filas
* **FilaEstatica:** implementação circular com array.
* **FilaDinamica:** encadeada com nós, suporte a dois construtores (`int valor` e `int valor, int tempo`).

### 📚 Pilhas
* **PilhaEstatica:** genérica, baseada em array.
* **PilhaDinamica:** genérica, encadeada.

---

## 🧠 Aplicações

* **Escalonador de Processos:** simula uma fila de processos com prioridade (maior valor de prioridade é atendido primeiro).
* **Gerenciador de Histórico:** controle de navegação com duas pilhas.
* **Simulação de Atendimento Bancário:** fila de clientes com tempos aleatórios de chegada e atendimento.

---

## ✅ Observações

* O código está organizado nos pacotes `aplicacoes`, `interfaces` e `pilha`. Os demos de filas e listas estão no pacote padrão (raiz de `src`).
* As estruturas de dados estão prontas para uso e podem ser integradas a outras aplicações.
* Em caso de dúvidas sobre a execução, verifique se o JDK está corretamente instalado e se a compilação foi bem‑sucedida (sem erros).
```

