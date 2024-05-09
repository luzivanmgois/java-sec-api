# API Vulnerável em Java

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![JWT](https://img.shields.io/badge/JWT-black?style=for-the-badge&logo=JSON%20web%20tokens)

Este projeto foi criado com vulnerabilidades para uso em laboratório como back-end e rodar localmente

## Instalação

1. Clone the repository:

```bash
git clone https://github.com/luzivangois/java-vuln-api.git
```

2. Instale as dependencias com Maven

## Uso

1. Start a aplicação com Maven
2. A API pode ser acessada em http://localhost:8080


## API Endpoints
A API prover os seguintes endpoints:

```markdown
POST /auth/register - Criar novo usuário

POST /auth/login - Logar na aplicação.

GET /auth/allusers - Consultador todos os usuários

GET /auth/userid/{id} - Consultar usuário por ID

GET /auth/updatepass - Atualizar senha do usuário

GET /auth/deluser/{id} - Deletar usuário por ID

POST /archive/sendfile - Salvar arquivo

GET /archive/name - Ler conteúdo do arquivo
```

## Autenticação
A API utiliza Spring Security para controlar a autenticação, conforme as permissões a seguir:

```
USER -> Permissão padrão para usuários.
ADMIN -> Permissão de admin para usuários administradores.
```

## Banco de Dados
O projeto utiliza Sqlite3 como solução de banco de dados
