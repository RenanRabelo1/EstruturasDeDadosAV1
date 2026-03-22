markdown
# Estruturas de Dados – Organização em Pacotes e Guia de Uso

Este projeto contém implementações de estruturas de dados lineares (listas, pilhas, filas) e aplicações de simulação, organizadas em pacotes Java. O código foi desenvolvido para a disciplina de Estruturas de Dados e pode ser utilizado como base para estudos ou integração em outros sistemas.

## 📁 Estrutura de Pacotes

Os arquivos foram organizados nos seguintes pacotes:
src/
├── estruturas/

│ ├── lista/

│ │ ├── ListaEstatica.java

│ │ ├── ListaSimplesmenteEncadeadaDesordenada.java

│ │ ├── ListaSimplesmenteEncadeadaOrdenada.java

│ │ ├── ListaDuplamenteEncadeadaNaoOrdenada.java

│ │ ├── ListaDuplamenteEncadeadaOrdenada.java

│ │ └── ManipulacaoDeListas.java


│ ├── pilha/

│ │ ├── PilhaEstatica.java

│ │ ├── PilhaDinamica.java

│ │ └── GerenciadorHistorico.java


│ └── fila/

│ ├── FilaEstatica.java

│ ├── FilaDinamica.java

│ ├── EscalonadorDeProcessos.java

│ └── SimulacaoAtendimento.java


└── aplicacoes/

└── Main.java

text

Cada classe possui um método `main` para testes individuais, exceto as classes auxiliares.

## 🔧 Pré‑requisitos

- **Java Development Kit (JDK)** – versão 21 ou superior (recomendado)
- Terminal / Prompt de comando

## ⚙️ Compilação

Navegue até a raiz do projeto (onde está a pasta `src`) e execute o comando:

no bash:
javac -d out $(find src -name "*.java")

Isso compilará todos os arquivos .java e colocará os .class no diretório out/, respeitando a estrutura de pacotes.

Alternativa (Windows):

bash
javac -d out src\estruturas\lista\*.java src\estruturas\pilha\*.java src\estruturas\fila\*.java src\aplicacoes\*.java
🚀 Execução
Após compilar, execute as classes utilizando o caminho completo do pacote.

1. Testar estruturas individualmente
Cada classe possui um método main que demonstra suas operações. Exemplos:

bash
# Lista estática
java -cp out estruturas.lista.ListaEstatica

# Pilha dinâmica
java -cp out estruturas.pilha.PilhaDinamica

# Fila dinâmica
java -cp out estruturas.fila.FilaDinamica
2. Executar aplicações completas
a) Simulação de Atendimento Bancário
bash
java -cp out estruturas.fila.SimulacaoAtendimento
A simulação mostra minuto a minuto a chegada de clientes (50% de chance por minuto) e o atendimento, calculando o tempo de espera.

b) Escalonador de Processos
bash
java -cp out estruturas.fila.EscalonadorDeProcessos
Processos com prioridade (valor maior = maior prioridade) são atendidos fora da ordem FIFO.

c) Gerenciador de Histórico (navegação)
bash
java -cp out estruturas.pilha.GerenciadorHistorico
Simula os botões “voltar” e “avançar” de um navegador, utilizando duas pilhas.

d) Manipulação de Listas
bash
java -cp out estruturas.lista.ManipulacaoDeListas
Demonstra operações de inserção, remoção, inversão e soma em uma lista estática.

🧠 Observações
Todas as implementações são genéricas onde aplicável (pilhas), mas listas e filas trabalham com int por simplicidade.

As estruturas encadeadas (listas, pilhas dinâmicas, fila dinâmica) utilizam classes internas No para representar os nós.

As versões estáticas possuem capacidade fixa e lançam exceções quando cheias ou vazias.

O projeto não utiliza bibliotecas externas; apenas o JDK padrão.

🧪 Testes e Validação
Cada classe principal contém um método main com cenários de teste. Recomenda-se executá-los individualmente para verificar o funcionamento.

Exemplo de saída esperada para FilaDinamica:

text
--- Testando Enfileiramento ---
Fila atual: 10 (tempo: 0)  20 (tempo: 0)  30 (tempo: 0)  
--- Testando Informações ---
Tamanho da fila: 3
Elemento na frente: 10
...
📚 Referências
Documentação oficial Java: https://docs.oracle.com/en/java/

Algoritmos e estruturas de dados: Cormen et al. (2012)
