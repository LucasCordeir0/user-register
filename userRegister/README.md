User Register

Como usar o projeto

1. Inicie o MySQL (XAMPP ou outro)

2. Crie o banco de dados:

CREATE DATABASE userdb;

USE userdb

CREATE TABLE users (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    cpf VARCHAR(11)
);
