# ContentHub Enterprise CMS

Kurumsal içerik yönetim sistemi: Java 21, Spring Boot, Spring Security, Spring Data JPA, PostgreSQL, JWT, Redis, Kafka ve React yönetim paneli.

## Çalıştırma
```bash
docker compose up --build
```
Yönetim paneli: http://localhost:3000 · API: http://localhost:8080 · Sağlık: http://localhost:8080/actuator/health

İlk yönetici için POST /api/auth/register:
```json
{"email":"admin@example.com","password":"ChangeMe123!","fullName":"ContentHub Admin"}
```
Dönen JWT ile giriş yapın. Üretimde JWT_SECRET ve veritabanı parolasını değiştirin.

## Teknolojiler
Java 21 · Spring Boot 3 · Spring Security/JWT · Spring Data JPA/Hibernate · PostgreSQL · Redis · Kafka · React/Vite · Docker Compose · GitHub Actions.

## API
- POST /api/auth/register, POST /api/auth/login
- GET /api/dashboard
- GET /api/contents (JWT)
- POST /api/contents, PUT /api/contents/{id}, DELETE /api/contents/{id} (JWT)
- GET /api/public/contents

Redis ve Kafka Compose ortamında hazırdır; cache/event akışları ilerleyen geliştirme adımlarında genişletilecektir.
