# Digital Banco

Projeto acadêmico baseado no quadro Trello Digital Banco.

## Funcionalidades
- Cadastro de cliente e abertura de conta.
- Login com senha armazenada em BCrypt.
- Consulta de saldo e extrato.
- Transferência PIX entre contas com validação de saldo e registro das movimentações.
- Interface React responsiva.

## Tecnologias
Java 17, Spring Boot 3, Spring Data JPA, MySQL, React 18, Vite e Axios.

## Executar
1. Crie o banco MySQL usando `database.sql`.
2. Configure `DB_URL`, `DB_USER` e `DB_PASSWORD`, se necessário.
3. API: `cd backend && mvn spring-boot:run` (porta 8080).
4. Frontend: `cd frontend && npm install && npm run dev` (porta 5173).

## Endpoints
- POST `/api/customers` cadastro
- POST `/api/auth/login` login
- GET `/api/accounts/{id}/balance` saldo
- GET `/api/accounts/{id}/statement` extrato
- POST `/api/accounts/{id}/pix` transferência
- GET `/api/health` saúde da API

## Atenção
Base acadêmica para execução local. Não utilizar com dinheiro ou dados reais. Antes de produção, implementar JWT/OAuth2, autorização efetiva por usuário autenticado, proteção contra abuso, idempotência de PIX, auditoria, validação completa de CPF, migrations e testes automatizados. O ID na URL não é mecanismo de autenticação.
