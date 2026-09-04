# Clinivox API

API REST desenvolvida em Java com Spring Boot para gerenciamento de pacientes e consultas.

## Tecnologias utilizadas

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Maven

## Estrutura do projeto

O projeto está organizado nas seguintes camadas:

```text
src/main/java/com/clinivox/api
├── controllers
│   ├── PacienteController.java
│   └── ConsultaController.java
│
├── entities
│   ├── Paciente.java
│   └── Consulta.java
│
├── repositories
│   ├── PacienteRepository.java
│   └── ConsultaRepository.java
│
└── services
    ├── PacienteService.java
    └── ConsultaService.java
```

## Entidades

### Paciente

A entidade `Paciente` possui os seguintes dados:

- ID
- Nome
- CPF
- Idade

### Consulta

A entidade `Consulta` possui os seguintes dados:

- ID
- Data
- Descrição

## Endpoints

### Pacientes

| Método | Endpoint | Descrição |
|:---:|---|---|
| GET | `/pacientes` | Lista todos os pacientes |
| GET | `/pacientes/{id}` | Busca um paciente pelo ID |
| POST | `/pacientes` | Cadastra um paciente |
| PUT | `/pacientes/{id}` | Atualiza um paciente |
| DELETE | `/pacientes/{id}` | Exclui um paciente |

### Consultas

| Método | Endpoint | Descrição |
|:---:|---|---|
| GET | `/consultas` | Lista todas as consultas |
| GET | `/consultas/{id}` | Busca uma consulta pelo ID |
| POST | `/consultas` | Cadastra uma consulta |
| PUT | `/consultas/{id}` | Atualiza uma consulta |
| DELETE | `/consultas/{id}` | Exclui uma consulta |

## Como executar o projeto

### 1. Clonar o repositório

```bash
git clone https://github.com/RamayannaG/clinivox-api.git
```

### 2. Entrar na pasta do projeto

```bash
cd clinivox-api
```

### 3. Executar a aplicação

No Windows, execute:

```powershell
.\mvnw.cmd spring-boot:run
```

A API será iniciada em:

```text
http://localhost:8080
```

## Banco de dados

O projeto utiliza o banco de dados H2 em memória para armazenamento dos dados durante a execução da aplicação.

Os dados são perdidos quando a aplicação é encerrada.

## Testes da API

Os endpoints podem ser testados utilizando ferramentas como Postman ou diretamente por requisições HTTP.

## Objetivo

Projeto desenvolvido como atividade acadêmica para implementação de uma API REST utilizando Java, Spring Boot, JPA e banco de dados H2.
