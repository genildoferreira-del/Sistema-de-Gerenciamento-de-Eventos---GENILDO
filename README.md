# Sistema de Gerenciamento de Eventos

**Aluno:** Genildo da Silva Ferreira

---

## Sobre o Projeto

Esse projeto em JAVA foi desenvolvido com a ideia de criar um sistema simples para gerenciar eventos. A proposta é permitir que o usuário consiga cadastrar, visualizar, editar e remover eventos de forma fácil.

Ele foi feito como atividade da disciplina, justamente para colocar em prática o que foi aprendido ao longo do semestre, principalmente:

* Programação Orientada a Objetos (POO)
* Projeto de Banco de Dados
* Interface Humano-Computador

---

## Tecnologias utilizadas

* Java
* Conceitos de POO
* IntelliJ IDEA
* GitHub
* Fifma

<img width="1365" height="414" alt="image" src="https://github.com/user-attachments/assets/67720de0-d4e4-4644-8b6d-acd79235f4a3" />

---

## Como o sistema foi organizado

### Classe Evento

A classe `Evento` é basicamente o coração do sistema. É ela que representa cada evento.

Ela guarda informações como:

* id (identificador único)
* nome
* data
* local
* descrição

Em resumo: essa classe serve para armazenar os dados de cada evento.
<img width="832" height="617" alt="image" src="https://github.com/user-attachments/assets/e29422b8-be14-42f9-adb9-07049b036314" />

---

### Classe GerenciadorEventos

Essa classe é responsável por gerenciar os eventos no sistema.

É nela que ficam as funcionalidades principais:

* cadastrar eventos
* listar eventos
* buscar evento por ID
* atualizar evento
* remover evento

Os eventos são armazenados em um `ArrayList`, funcionando como uma lista em memória.

A escolha do `ArrayList` foi feita por ser uma estrutura simples e suficiente para esse tipo de aplicação, permitindo manipulação fácil dos dados.
<img width="843" height="630" alt="image" src="https://github.com/user-attachments/assets/618c168a-82a8-43f5-a16c-c29aa38fb68b" />

---

### Classe Main

A classe `Main` é o ponto de entrada do sistema.

Ela apresenta um menu no console, permitindo que o usuário escolha as opções disponíveis e interaja com o sistema.
<img width="863" height="666" alt="image" src="https://github.com/user-attachments/assets/30586de0-a9dd-40e3-b552-0e387eeaddcf" />

---

## Banco de Dados

Mesmo o sistema funcionando em memória, foi definido um modelo de banco de dados para representar como os dados poderiam ser persistidos.

```sql id="r9n0yd"
CREATE TABLE eventos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    data DATE NOT NULL,
    local VARCHAR(100) NOT NULL,
    descricao TEXT,

    CONSTRAINT chk_nome CHECK (CHAR_LENGTH(nome) > 3)
);

CREATE INDEX idx_nome_evento ON eventos(nome);
```

### Justificativas

* `INT AUTO_INCREMENT`: garante identificação única automática
* `VARCHAR(100)`: tamanho adequado para nome e local
* `DATE`: apropriado para armazenar datas
* `TEXT`: permite descrições mais detalhadas
* `NOT NULL`: evita dados obrigatórios vazios
* `CHECK`: garante um tamanho mínimo para o nome
* `INDEX`: melhora o desempenho em buscas por nome

---

## Wireframe

O sistema foi pensado com as seguintes telas principais:

* Tela inicial
  
 <img width="731" height="426" alt="image" src="https://github.com/user-attachments/assets/e3a06ac6-c04f-46f3-8a12-c0a9c12638d1" />


* Tela de listagem de eventos  
  
 <img width="775" height="424" alt="image" src="https://github.com/user-attachments/assets/a2ef4a98-38da-4415-ae85-e9642ec46f36" />

* Tela de cadastro de evento

 <img width="745" height="423" alt="image" src="https://github.com/user-attachments/assets/3284b2da-0b83-442b-a241-9868c8c54cbe" />

* Tela de edição de evento

 <img width="748" height="414" alt="image" src="https://github.com/user-attachments/assets/84c38cb6-4665-44cc-8b9b-b6bb11408bd5" />

---

## Estrutura do sistema (Sitemap)

```
Tela Inicial
 ├── Listar Eventos
 ├── Cadastrar Evento
 ├── Editar Evento
 └── Remover Evento
```
![Sem título](https://github.com/user-attachments/assets/e5e4d557-1c6d-4be9-b4ec-1c91012327f3)


### Funcionamento

O usuário inicia no menu principal, escolhe uma opção, executa a ação desejada e retorna ao menu após a operação.

---

## Como rodar o projeto

1. Clone o repositório:

```
git clone <link-do-repositorio>
```

2. Abra o projeto no IntelliJ

3. Execute a classe `Main.java`

---

## Considerações finais

Este projeto permitiu aplicar conceitos importantes de programação orientada a objetos, organização de código e modelagem de dados.

## Também ajudou a entender como estruturar um sistema completo, mesmo sendo uma versão simples, integrando lógica, estrutura e planejamento.
