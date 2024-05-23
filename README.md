
# Wine - API VINHOS

Api para comercio de vinhos


Execute o comando docker-compose up na pasta do projeto







## Banco de dados

Execute o comando abaixo na pasta do projeto para criar um banco e subir o mesmo

```bash
  docker-compose up
```

Com o banco Postgre "No ar" execute a aplicação, aplicação esta na porta: 8008






## Documentação da API - URI para uso

#### Persistir base

```http
  Post /api/persistir
```

Acessa as duas URL dos dados mockado e persistem no banco, OBS: ainda não crie as os tratamentos de exception, favor persistir uma vez

## 
## 
#### Lista de compras


```http
  GET /api/compras
```
Retorna uma lista de compras: compras ordenadas de forma crescente por valor, deve conter o nome dos clientes, cpf dos clientes, dado dos produtos, quantidade das compras e valores totais de cada compra.
Recebe dois números e retorna a sua soma.

## 
## 
#### Maior Compra

```http
  GET /api/maior-compra/${ano}
```

Retornar a maior compra do ano informando os dados da compra disponibilizados, deve ter o nome do cliente, cpf do cliente, dado do produto, quantidade da compra e seu valor total


## 
## 
#### Top 3 clientes fieis

```http
  GET /api/clientes-fieis
```
Retornar o Top 3 clientes mais fieis, clientes que possuem mais compras recorrentes com maiores valores

## 
## 
#### Recomendação de vinho (Mais Vendido)

```http
  GET /api/recomendacao/cliente/tipo
```
Retornar uma recomendação de vinho baseado nos tipos de vinho que o cliente mais compra

## 
## 
## 

## Documentação da API - URI para uso

* JAVA
* Spring boot
* FeignClient
* JPA 
* HIBERNATE
* Arquitetura Hexagonal
* JPQL
* Postgres


## Novos desenvolvimentos

* Criação de @RestControllerAdvice para tramento de exception
* Swagger



