# Sistema de Gerenciamento de Eventos

**Aluno:** Genildo da Silva Ferreira

---

## Sobre o Projeto

Esse projeto foi desenvolvido com a ideia de criar um sistema simples para gerenciar eventos. A proposta é permitir que o usuário consiga cadastrar, visualizar, editar e remover eventos de forma fácil.

Ele foi feito como atividade da disciplina, justamente para colocar em prática o que foi aprendido ao longo do semestre, principalmente:

* Programação Orientada a Objetos (POO)
* Banco de Dados
* Organização de sistemas

---

## Tecnologias utilizadas

* Java
* Conceitos de POO
* IntelliJ IDEA
* GitHub

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

---

### Classe GerenciadorEventos

Essa classe é responsável por “cuidar” dos eventos.

É nela que ficam as funcionalidades principais do sistema:

* cadastrar eventos
* listar eventos
* buscar evento por ID
* atualizar evento
* remover evento

Os eventos são guardados em um `ArrayList`, que funciona como uma lista em memória.

Por que usei ArrayList?
Porque é simples de usar e atende bem para esse tipo de sistema pequeno, permitindo adicionar, buscar e remover elementos com facilidade.

---

### Classe Main

Aqui é onde tudo começa.

A classe `Main` mostra um menu no console, onde o usuário escolhe o que quer fazer (cadastrar, listar, etc.).

Ela faz a ligação entre o usuário e o sistema.

---

## Banco de Dados

Mesmo o sistema funcionando em memória, também foi pensado um modelo de banco de dados para armazenar os eventos.

```sql
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

* `INT AUTO_INCREMENT`: gera automaticamente o ID
* `VARCHAR(100)`: tamanho suficiente para nome e local
* `DATE`: ideal para datas
* `TEXT`: permite descrições maiores
* `NOT NULL`: evita campos importantes vazios
* `CHECK`: garante que o nome não seja muito curto
* `INDEX`: melhora a busca por nome

---

## Wireframe (Protótipo das telas)

O wireframe mostra como o sistema seria visualmente.

Telas pensadas:

* Tela inicial (menu)
* Listagem de eventos
* Cadastro de evento
* Edição de evento

(Aqui você pode adicionar imagem ou link do Figma/Canva)

---

## Estrutura do sistema (Sitemap)

Basicamente o sistema funciona assim:

```
Tela Inicial
 ├── Listar Eventos
 ├── Cadastrar Evento
 ├── Editar Evento
 └── Remover Evento
```

### Como o usuário navega

O usuário começa no menu principal, escolhe uma opção, executa a ação e depois volta para o menu.

Simples e direto.

---

## Como rodar o projeto

1. Clone o repositório:

```
git clone <link-do-repositorio>
```

2. Abra no IntelliJ

3. Execute a classe `Main.java`

---

## Vídeo explicativo

(Coloque aqui o link do vídeo)

---

## Considerações finais

Esse projeto foi importante para praticar:

* Organização de código
* Uso de classes e objetos
* Lógica de programação
* Estruturação de um sistema simples

Além disso, ajudou a entender melhor como um sistema real pode ser construído, mesmo que em versão básica.

---
