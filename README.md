# Sistema de Gerenciamento de Eventos
# ALUNo: Genildo da Silva Ferreira

## Descrição do Projeto

Este projeto foi desenvolvido com o objetivo de criar um sistema simples para gerenciamento de eventos. A ideia é permitir que o usuário consiga cadastrar, visualizar, atualizar e remover eventos de forma prática.

Esse trabalho foi realizado como parte de uma atividade acadêmica, com o intuito de aplicar os conceitos vistos em aula, principalmente os de Programação Orientada a Objetos.

### Tecnologias utilizadas
- Java  
- Programação Orientada a Objetos (POO)  
- IntelliJ IDEA  
- GitHub  

---

## Explicação das Classes

### Classe Evento

A classe `Evento` representa um evento dentro do sistema.

Ela possui os seguintes atributos:
- id: identifica cada evento de forma única  
- nome: nome do evento  
- data: data em que o evento vai acontecer  
- local: onde o evento será realizado  
- descricao: informações sobre o evento  

Basicamente, essa classe serve para armazenar os dados de cada evento.

---

### Classe GerenciadorEventos

Essa classe é responsável por fazer o gerenciamento dos eventos no sistema.

Ela permite:
- cadastrar eventos  
- listar eventos  
- buscar eventos pelo ID  
- atualizar eventos  
- remover eventos  

Os eventos são armazenados em uma lista (ArrayList), que funciona como uma memória temporária.

---

### Classe Main

A classe `Main` é onde o programa começa a rodar.

Ela apresenta um menu no console, permitindo que o usuário escolha as opções e interaja com o sistema.

---

## Projeto Físico do Banco de Dados

A estrutura da tabela utilizada no banco de dados é a seguinte:

```sql
CREATE TABLE eventos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    data DATE NOT NULL,
    local VARCHAR(100) NOT NULL,
    descricao TEXT
);
