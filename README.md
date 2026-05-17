# Cadastro simples de produtos com autenticação criptografada.

Projeto utilizando Spring Boot com autenticação usando JWT.

O objetivo principal desse projeto foi estudar conceitos básicos e importantes do ecossistema Java/Spring, como:

- API REST
- MVC
- Spring Web
- Spring Security
- JWT Authentication
- JPA/Hibernate
- PostgreSQL
- Criptografia de senha
- CRUD
- Integração com banco de dados

---

# Tecnologias utilizadas

- Java
- Spring Boot
- Spring Web
- Spring Security
- JWT
- Spring Data JPA
- PostgreSQL
- Docker
- Maven

---

# Funcionalidades

## Autenticação

A aplicação possui:

- Registro de usuário
- Login de usuário
- Geração de token JWT
- Rotas protegidas

---

## Registro

Endpoint:

```http
POST /api/register
```

Body da requisição:

```json
{
  "username": "usuario",
  "password": "123456"
}
```

A senha é criptografada antes de ser salva no banco de dados.

---

## Login

Endpoint:

```http
POST /api/login
```

Body:

```json
{
  "username": "usuario",
  "password": "123456"
}
```

Ao autenticar corretamente, a API retorna um token JWT.

---

## Rotas protegidas

As demais requisições utilizam autenticação Bearer Token:

```http
Authorization: Bearer SEU_TOKEN
```

O token é obtido após realizar login em:

```http
POST /api/login
```

---

Endpoints disponíveis:

Listar produtos:

Retorna todos os produtos cadastrados no banco.

```http
GET /api/produtos
```

Buscar produto por ID:

Retorna um produto específico baseado no ID informado.

```http
GET /api/produtos/{id}
```
Exemplo:

```http
GET /api/produtos/1
```

Criar produto:

Cria um novo produto no banco de dados.

```http
POST /api/produtos
```
Body da requisição:
```json
{
  "name": "Notebook",
  "price": 3500
}
```

Deletar produto:

Remove um produto do banco utilizando o ID.

```http
DELETE /api/produtos/{id}
```
Exemplo:

```http
DELETE /api/produtos/1
```

---

# Segurança

O projeto utiliza Spring Security + JWT para autenticação.

As senhas dos usuários são armazenadas de forma criptografada no banco utilizando encoder do Spring Security.

Isso significa que mesmo que alguém tenha acesso ao banco de dados, as senhas não ficam armazenadas em texto puro.

---

# Banco de dados

O projeto utiliza PostgreSQL.

A conexão é feita utilizando variáveis de ambiente no `application.properties`.

Exemplo:

```properties
spring.datasource.username=${DB_USERNAME}
spring.datasource.password=${DB_PASSWORD}
```

---

# Variáveis de ambiente

Crie um arquivo `.env` na raiz do projeto:

```env
export DB_USERNAME=postgres
export DB_PASSWORD=123456
export JWT_SECRET=sua_chave_jwt
```

Depois carregue as variáveis:

```bash
source .env
```

---

# Docker

O banco PostgreSQL pode ser executado utilizando Docker.

Subir container:

```bash
docker compose up -d
```

Parar container:

```bash
docker compose down
```

---

# Como executar o projeto

## 1. Clone o repositório

```bash
git clone https://github.com/JoaoSilvanodev/first-springboot-proj
```

---

## 2. Entre na pasta

```bash
cd first-springboot-proj
```

---

## 3. Configure as variáveis de ambiente

Crie o `.env` e carregue:

```bash
source .env
```

---

## 4. Suba o PostgreSQL

```bash
docker compose up -d
```

---

## 5. Execute o projeto

```bash
./mvnw spring-boot:run
```

---

# Objetivo do projeto

Esse projeto foi criado baseado na aula CURSO GRATIS SPRING BOOT PARA INICIANTES ☕👩🏻‍💻 | 2025 Disponível em:
(https://www.youtube.com/watch?v=SqU9v_V32RA)

Além do desenvolvimento da API em si, o projeto também serviu para estudar conceitos importantes do ambiente backend, como:

- Configuração de variáveis de ambiente
- Segurança básica
- JWT
- Persistência de dados
- Docker
- PostgreSQL
- Integração entre aplicação e banco
- Estruturação básica de backend com Spring

---

# Autor Original

Matheus Leandro Ferreira
(https://www.youtube.com/@matheuslf)

GitHub: https://github.com/matheuslf
