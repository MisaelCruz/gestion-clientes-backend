# Sistema de Gestión de Clientes - Backend API

Este repositorio contiene la API REST robusta encargada de la lógica de negocio y la persistencia de datos del Sistema de Gestión de Clientes. Está desarrollado con el framework Spring Boot y configurado para comunicarse de forma segura con una base de datos relacional y un cliente de frontend desacoplado.

---

## Tecnologías Utilizadas

* **Java (JDK 17+)**
* **Spring Boot** (Spring Web, Spring Data JPA)
* **MySQL** (Base de datos relacional)
* **Maven** (Gestor de dependencias)

---

## Características Principales

* **Arquitectura REST:** Exposición de endpoints limpios bajo las mejores prácticas para operaciones CRUD (`GET`, `POST`, `PUT`, `DELETE`).
* **Persistencia de Datos:** Uso de Spring Data JPA con Hibernate para el mapeo objeto-relacional (ORM) automático de la entidad Cliente.
* **Seguridad (CORS):** Configuración de políticas de Cross-Origin Resource Sharing para permitir la comunicación exclusiva con el frontend en desarrollo.

---

## Pruebas de Endpoints con Postman

Antes de conectar el frontend, la API REST fue probada y validada utilizando **Postman** para garantizar el correcto funcionamiento de las peticiones HTTP:
* `GET /api/v1/clientes` - Listar todos los clientes de la base de datos.
* `POST /api/v1/clientes` - Crear un nuevo registro.
* `PUT /api/v1/clientes/{id}` - Actualizar los datos de un cliente existente.
* `DELETE /api/v1/clientes/{id}` - Eliminar un cliente por su ID.

---

## Demostración Visual



---

## Frontend Relacionado
Puedes encontrar el repositorio del cliente de React diseñado para consumir esta API aquí: [Enlace al Repositorio Frontend]