# ☕ Java Backend — exercícios e mini-projetos

Repositório com os exercícios e mini-projetos que desenvolvi durante a formação **Full Stack Java da EBAC**. Os exercícios estão organizados por tema e mostram a minha evolução: da Programação Orientada a Objetos até APIs REST com Spring Boot e microsserviços.

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=flat&logo=springboot&logoColor=white)
![Hibernate](https://img.shields.io/badge/Hibernate-59666C?style=flat&logo=hibernate&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-4169E1?style=flat&logo=postgresql&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=flat&logo=apachemaven&logoColor=white)
![Gradle](https://img.shields.io/badge/Gradle-02303A?style=flat&logo=gradle&logoColor=white)
![JUnit](https://img.shields.io/badge/JUnit-25A162?style=flat&logo=junit5&logoColor=white)

---

## ⭐ Destaques

| Projeto | O que mostra | Tecnologias |
|---|---|---|
| [**Microsserviços — loja online**](exercicio_mod41) | Dois microsserviços independentes (`msCliente` e `msProduto`), cada um com a sua base de dados, e um `ConfigServer` | Spring Boot, Spring Data JPA, H2, Gradle |
| [**API REST — CRUD de utilizadores**](exercicio_mod39/usercrud) | Endpoints GET, POST, PUT e DELETE organizados em controller e repository | Spring Boot, Spring Web, Spring Data JPA, PostgreSQL, Lombok |
| [**Gestão de carros**](exercicio_mod-33) | Camadas de repository e service, interface CRUD genérica, exceções personalizadas e testes | Spring Boot, Spring Data JPA, Bean Validation, H2, JUnit 5 |
| [**Vendas Online (web)**](vendas-online-jsf) | Aplicação web com listagens de clientes, produtos e vendas | JSF, PrimeFaces, JPA, PostgreSQL |
| [**Sistema de vendas com JPA**](exercicio_mod35) | DAO e services genéricos, ligação a várias bases de dados (PostgreSQL e MySQL) e hierarquia de exceções | JPA / Hibernate, JUnit |

---

## 📚 Índice por tema

### 1. Fundamentos e Orientação a Objetos
| Pasta | Conteúdo |
|---|---|
| [`src`](src) | Primeiro programa (Hello World) |
| [`tarefa_classes`](tarefa_classes) | Classes, atributos e métodos |
| [`tarefa-orientacao-objetos`](tarefa-orientacao-objetos) | Classes abstratas e herança (pessoa física e jurídica, cálculo de impostos) |
| [`tarefa_calculo_media`](tarefa_calculo_media) · [`tarefa_nota_aluno`](tarefa_nota_aluno) | Lógica, cálculo de médias e estruturas de decisão |
| [`tarefa_wrapper`](tarefa_wrapper) | Classes wrapper e conversões de tipos |

### 2. Recursos da linguagem
| Pasta | Conteúdo |
|---|---|
| [`tarefa_colecoes-parte-1`](tarefa_colecoes-parte-1) · [`tarefa_colecoes-parte-2`](tarefa_colecoes-parte-2) | Collections (List, Set, Map) |
| [`Generics`](Generics) | Tipos genéricos |
| [`tarefa_streams`](tarefa_streams) | Streams API e lambdas |
| [`tarefa_annotation`](tarefa_annotation) | Anotações personalizadas |
| [`tarefa_reflection`](tarefa_reflection) | Reflection |

### 3. Padrões de projeto
| Pasta | Conteúdo |
|---|---|
| [`tarefa_padroes-de-projeto-1`](tarefa_padroes-de-projeto-1) | Factory Method (fábricas de carros) |
| [`CadastroCliente`](CadastroCliente) · [`Projeto1`](Projeto1) | Padrão DAO e interface gráfica com Swing |

### 4. Testes
| Pasta | Conteúdo |
|---|---|
| [`testes-parte-1`](testes-parte-1) | Primeiros testes unitários com JUnit 5 |
| [`mod23e24`](mod23e24) | Testes com JUnit, mocks de DAO e test suites |

### 5. Persistência de dados
| Pasta | Conteúdo |
|---|---|
| [`Projeto2`](Projeto2) | Sistema de vendas com DAO genérico e anotações personalizadas |
| [`Projeto3`](Projeto3) | JDBC: CRUD de clientes e produtos, com testes |
| [`exercicio_mod30`](exercicio_mod30) | Sistema de vendas com JDBC e base de dados relacional |
| [`ExemploJPA`](ExemploJPA) | Primeiros passos com JPA / Hibernate e PostgreSQL |
| [`exercicio_mod34`](exercicio_mod34) · [`exercicio_mod35`](exercicio_mod35) | Migração do sistema de vendas para JPA, com múltiplas bases de dados |

### 6. Build e dependências
| Pasta | Conteúdo |
|---|---|
| [`PrimeiroProjetoMavenIt`](PrimeiroProjetoMavenIt) | Primeiro projeto Maven (Jackson, Commons Lang, JUnit) |

### 7. Web e Spring
| Pasta | Conteúdo |
|---|---|
| [`vendas-online-jsf`](vendas-online-jsf) | Aplicação web com JSF e PrimeFaces |
| [`mod-33`](mod-33) · [`exercicio_mod-33`](exercicio_mod-33) | Spring Boot com Spring Data JPA |
| [`exercicio_mod39`](exercicio_mod39) | API REST com Spring Boot |
| [`exercicio_mod41`](exercicio_mod41) | Arquitetura de microsserviços |

---

## ▶️ Como executar um projeto Spring Boot

```bash
git clone https://github.com/hannasampaio/java-backend.git

# API REST (Maven)
cd java-backend/exercicio_mod39/usercrud
./mvnw spring-boot:run

# Microsserviço de clientes (Gradle) — porta 8081
cd ../../exercicio_mod41/msCliente
./gradlew bootRun
```

---

Desenvolvido por **Hanna Sampaio** · [LinkedIn](https://www.linkedin.com/in/hannasampaio7/) · [GitHub](https://github.com/hannasampaio)
