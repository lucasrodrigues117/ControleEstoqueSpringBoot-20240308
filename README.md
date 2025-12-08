


https://github.com/user-attachments/assets/8720a6e5-0d78-4334-a967-db9148a4ba58


# API REST – Controle de Estoque

## 🚀 Rotas da API

### 📂 Categorias
GET /api/categorias  
GET /api/categorias/{id}  
POST /api/categorias  
PUT /api/categorias/{id}  
DELETE /api/categorias/{id}  

### 🏭 Fornecedores
GET /api/fornecedores  
GET /api/fornecedores/{id}  
POST /api/fornecedores  
PUT /api/fornecedores/{id}  
DELETE /api/fornecedores/{id}  

### 📦 Produtos
GET /api/produtos  
GET /api/produtos/{id}  
POST /api/produtos  
PUT /api/produtos/{id}  
DELETE /api/produtos/{id}  

### 👥 Clientes
GET /api/clientes  
GET /api/clientes/{id}  
POST /api/clientes  
PUT /api/clientes/{id}  
DELETE /api/clientes/{id}  

### 💰 Vendas
GET /api/vendas  
GET /api/vendas/{id}  
POST /api/vendas  

## 📝 Exemplos de JSON

### Criar Categoria
```json
{
  "nome": "Eletrônicos"
}
Criar Fornecedor
json
Copy code
{
  "nome": "TechSupply Inc"
}
Criar Produto
json
Copy code
{
  "nome": "Notebook Gamer Pro",
  "preco": 4500.00,
  "categoria": { "id": 1 },
  "fornecedores": [{ "id": 1 }],
  "estoque": { "quantidade": 15 }
}
Criar Cliente
json
Copy code
{
  "nome": "João Silva",
  "email": "joao@email.com",
  "telefone": "(19) 99999-9999"
}
Registrar Venda
json
Copy code
{
  "clienteId": 1,
  "itens": [
    {
      "produtoId": 1,
      "quantidade": 2
    }
  ]
}
⚙️ Como Executar
1. Configure o banco em application.properties
properties
Copy code
spring.datasource.username=SEU_USUARIO
spring.datasource.password=SUA_SENHA
2. Execute o projeto
bash
Copy code
mvn spring-boot:run
URL base
arduino
Copy code
http://localhost:8080
