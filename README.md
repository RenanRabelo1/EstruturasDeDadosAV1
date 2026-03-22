# 📚 Sistema de Estruturas de Dados em Java

## 📌 Descrição

Este projeto implementa diversas estruturas de dados fundamentais em Java, sem o uso de bibliotecas prontas, com o objetivo de demonstrar seu funcionamento interno e aplicações práticas.

Além das implementações, o projeto inclui simulações que aplicam essas estruturas em cenários reais, como atendimento em filas e escalonamento de processos.

---

## 🧠 Estruturas de Dados Implementadas

### 🔹 Filas
- `FilaDinamica`
- `FilaEstatica`

Funcionalidades:
- Enfileirar (inserção)
- Desenfileirar (remoção)
- Consulta do primeiro elemento
- Busca
- Impressão da fila

---

### 🔹 Listas

#### 📋 Lista Estática
- Inserção
- Remoção
- Busca
- Verificação de cheia/vazia

#### 🔗 Lista Simplesmente Encadeada
- Ordenada
- Não ordenada

#### 🔗🔗 Lista Duplamente Encadeada
- Ordenada
- Não ordenada

Funcionalidades gerais:
- Inserção
- Remoção
- Busca
- Impressão
- Impressão reversa (quando aplicável)
- Liberação de memória

---

## 🚀 Simulações Implementadas

### 🏥 Simulação de Atendimento
Arquivo: `SimulacaoAtendimento.java`

- Simula uma fila de atendimento (ex: banco)
- Clientes chegam de forma aleatória
- Tempo de atendimento também é aleatório
- Calcula tempo de espera dos clientes
- Exibe o estado do sistema a cada minuto

---

### ⚙️ Escalonador de Processos
Arquivo: `EscalonadorDeProcessos.java`

- Simula um sistema de prioridade
- Processos possuem:
    - prioridade (valor)
    - tempo de execução
- O processo com maior prioridade é executado primeiro
- A fila é reorganizada dinamicamente

---

## ⚙️ Como executar o projeto

### 🔧 Pré-requisitos
- Java JDK 8 ou superior instalado
- Terminal (Prompt de comando, PowerShell ou terminal do VS Code)

---

### ▶️ Passo a passo

1. Baixe ou extraia o projeto (.zip)

2. Abra o terminal na pasta onde estão os arquivos `.java`

3. Compile todos os arquivos:

```
javac *.java
```

4. Execute uma das classes com método `main`

---

## ▶️ Execução das simulações

### 🏥 Simulação de Atendimento
```
java SimulacaoAtendimento
```

---

### ⚙️ Escalonador de Processos
```
java EscalonadorDeProcessos
```

---

## ▶️ Execução das estruturas (testes)

### Lista Estática
```
java ListaEstatica
```

### Lista Duplamente Encadeada (não ordenada)
```
java ListaDuplamenteEncadeadaNaoOrdenada
```

### Lista Duplamente Encadeada (ordenada)
```
java ListaDuplamenteEncadeadaOrdenada
```

### Lista Simplesmente Encadeada (não ordenada)
```
java ListaSimplesmenteEncadeadaDesordenada
```

### Lista Simplesmente Encadeada (ordenada)
```
java ListaSimplesmenteEncadeadaOrdenada
```

---

## 🗂️ Estrutura do projeto

O projeto é composto pelos seguintes arquivos:

- FilaDinamica.java
- FilaEstatica.java

- ListaEstatica.java
- ListaSimplesmenteEncadeadaDesordenada.java
- ListaSimplesmenteEncadeadaOrdenada.java

- ListaDuplamenteEncadeadaNaoOrdenada.java
- ListaDuplamenteEncadeadaOrdenada.java

- SimulacaoAtendimento.java
- EscalonadorDeProcessos.java

---

## 🧠 Conceitos aplicados

- Estruturas de dados lineares
- Alocação dinâmica de memória
- Encadeamento de nós
- Manipulação de referências
- Encapsulamento
- Simulação de sistemas reais

---

## 🧪 Testes

Os testes foram realizados diretamente nos métodos `main` de cada classe, demonstrando:

- Inserção de elementos
- Remoção
- Busca
- Impressão
- Execução de simulações completas

---

## ⚠️ Observações

- Certifique-se de que todos os arquivos `.java` estejam na mesma pasta
- Caso ocorra erro de compilação, verifique se o Java está instalado corretamente
- O projeto foi desenvolvido para execução via terminal

---

## 👨‍💻 Autor

- Zíltom Machado
