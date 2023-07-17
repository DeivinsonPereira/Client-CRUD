# Client-CRUD

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/DeivinsonPereira/Client-CRUD/blob/main/LICENSE)

O projeto Client tem como objetivo a implementação das requisições **CRUD** (Create, Read, Update, Delete) de um sistema de carteira de clientes, utilizando o padrão camadas e Rest API. Além disso, foi implementado a busca por clientes do banco de dados de forma paginada.

## Modelo de Domínio

Foi utilizado esse modelo de domínio para a criação da classe **Client**.

![Modelo de Dominio](https://github.com/DeivinsonPereira/Client-CRUD/blob/main/assets/modelo-dom%C3%ADnio.png)

## Banco de Dados preenchido

Foi utilizado o Banco h2 para testar e guardar as informações inseridas no arquivo **import.sql**

![banco de dados](https://github.com/DeivinsonPereira/Client-CRUD/blob/main/assets/bancoh2.png)


## Captura de Clientes Paginados GET

Essa imagem mostra a execução do teste da api onde captura os clientes e mostra de forma paginada.

![Clientes paginados](https://github.com/DeivinsonPereira/Client-CRUD/blob/main/assets/client-paged.png)

## Busca por Id GET

Esse método busca os elementos do banco de dados de acordo com o id informado como no print abaixo.

![get by id](https://github.com/DeivinsonPereira/Client-CRUD/blob/main/assets/get-by-id.png)


## Método POST

Este método é usado para inserir novos "clientes" dentro do banco de dados.

![post](https://github.com/DeivinsonPereira/Client-CRUD/blob/main/assets/post.png)

## Método PUT

Esse método atualiza as informações de acordo com o id fornecido na api.

![put](https://github.com/DeivinsonPereira/Client-CRUD/blob/main/assets/put.png)

## Método DELETE

Esse método simplesmente deleta as informações do banco de dados de acordo com o id informado.

![delete](https://github.com/DeivinsonPereira/Client-CRUD/blob/main/assets/Delete.png)


# Tecnologias utilizadas

## Técnologias Backend

- Java 17
- Spring Boot
- Spring Data JPA / Hibernate
- Maven
- Postman
- H2 Database

## Técnicas utilizadas

- Padrão camadas
- Padrão Rest


# Como executar o projeto

## Pré-requisitos
- Java 17
- Postman (para executar os testes de requisição)

```bash
# clonar repositório
git clone https://github.com/DeivinsonPereira/Client-CRUD.git

# entrar na pasta do projeto back end
cd clientecrud

# executar o projeto
./mvnw spring-boot:run
```
# Autor

Deivinson Robes Pereira

https://www.linkedin.com/in/deivinsonpereira/

