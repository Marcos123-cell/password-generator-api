# 🔐 Password Generator API

A RESTful API developed with Java and Spring Boot that generates secure random passwords based on a user-defined length.

## 📖 About the Project

This project was created to strengthen my knowledge of REST APIs and back-end development with Spring Boot. The main goal was to practice service layers, DTOs, exception handling, request processing, and business logic implementation.

## 🚀 Technologies Used

* Java 21
* Spring Boot
* Maven
* Lombok

## ✨ Features

* Generate random passwords
* Custom password length
* Password length validation
* Global exception handling
* RESTful architecture

## 📌 Endpoint

### Generate Password

```http
GET /senhas/gerarSenha/{tamanho}
```

### Example Request

```http
GET /senhas/gerarSenha/12
```

### Success Response

```json
{
  "senha": "A7#mK2@pL9xQ",
  "tamanho": 12
}
```

### Error Response

```json
{
  "mensagem": "Não foi possível criar uma senha. A senha deve conter de 6 a 50 caracteres"
}
```

## 📂 Project Structure

```text
src
├── controller
├── service
├── dto
└── exceptions
```

## 🎯 Learning Objectives

* Build REST APIs with Spring Boot
* Apply separation of responsibilities using Controller, Service, and DTO layers
* Implement custom exception handling
* Work with Path Variables
* Improve Java business logic skills

## 👨‍💻 Author

Marcos Eduardo Francisco dos Santos

GitHub: https://github.com/Marcos123-cell
LinkedIn: https://www.linkedin.com/in/marcos-eduardo-dudu/
