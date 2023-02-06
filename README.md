# backend-kyrosb-02

## 🎲 Rodando o BackEnd (servidor)

```bash
# Clone este repositório
$ git clone <https://github.com/tarciorodrigues/backend-kyrosb-02.git>

# Acesse a pasta do projeto no terminal/cmd
$ cd backend-kyrosb-02

# Instale as dependências
$ mvn clean install

# Execute a instalação da imagem no docker
$ docker run --name mysqldb -e MYSQL_ROOT_PASSWORD=Password -e MYSQL_DATABASE=mydb -d -p 3306:3306 mysql:latest

# Execute
$mvn spring-boot:run

# O servidor inciará na porta:8080 - acesse <http://localhost:8080>

# Acesse a documentação do Swagger 
$ http://localhost:8080/swagger-ui.html#/
