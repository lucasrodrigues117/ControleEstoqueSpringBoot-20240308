
https://github.com/user-attachments/assets/87df2010-af9b-4b39-9aa9-8e17c814505b
📦 API REST - Controle de Estoque
🚀 Rotas da API
Categorias
GET    /api/categorias          - Lista todas as categorias
GET    /api/categorias/{id}     - Busca categoria por ID
POST   /api/categorias          - Cria nova categoria
PUT    /api/categorias/{id}     - Atualiza categoria
DELETE /api/categorias/{id}     - Remove categoria

📝 Exemplos de JSON
Criar Categoria

POST /api/categorias

{
  "nome": "Eletrônicos"
}

⚙️ Como Executar
1️⃣ Configurar o banco de dados no application.properties:
spring.datasource.url=jdbc:mysql://localhost:3306/estoque_db
spring.datasource.username=root
spring.datasource.password=SUA_SENHA

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

2️⃣ Executar o projeto
mvn spring-boot:run


👉 A API estará disponível em:
http://localhost:8080
