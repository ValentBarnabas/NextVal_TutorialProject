# NextVal Tutorial Project
Tutorial project for internship in NextVal Ltd.

## Main Functions
- Movie, Actor, Director, Membership, AcademyOfActors and Rating entities
  - can be added, searched, updated and deleted
- Communication between modules IMDB and Rating
- Can create user account
- Access is controlled for modifying endpoints
  - right to create, modify and delete data is controlled by roles

## Explored technoligies
- Spring Boot
- CRUD repository
- REST API
  - executing communication between separate modules
- Docker container
  - database handling
- H2
- PostgreSQL
- DTO classes
  - request and response mapping
- creating custom exceptions
- Spring Data One-To-Many and Many-To-Many relations
  - Many-To-Many with and without using external objects
- MapStruct
  - automated mapping
- Custom queries
- Multi-module gradle project
- API client
  - for weakening coupling between modules
- OpenFeign
- Spring Security
  - roles, authorities
- database stored user with hashed password for security