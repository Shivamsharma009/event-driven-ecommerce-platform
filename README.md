# 🛒 Event-Driven E-Commerce Platform

A production-style microservices backend for an e-commerce system powered by **Spring Boot**, **Apache Kafka**, **Docker**, and **PostgreSQL**. This project demonstrates asynchronous event orchestration across services using Kafka, enriched with observability, resilience, and real-time updates.

---

## 📦 Tech Stack

- **Spring Boot 3.x**
- **Apache Kafka** (event bus)
- **PostgreSQL** (per-service persistence)
- **Docker & Docker Compose**
- **Prometheus & Grafana** (metrics)
- **Resilience4j** (circuit breaker, retry)
- **Micrometer**, **Lombok**, **Swagger/OpenAPI**
- **WebSocket Gateway** (for real-time updates)

---

## 🧱 Microservices

| Service           | Responsibilities                              |
|-------------------|------------------------------------------------|
| `cart-service`     | Manages user cart items and sessions          |
| `order-service`    | Places orders, emits `OrderPlaced` events     |
| `inventory-service`| Validates & reserves stock via `InventoryChecked` |
| `payment-service`  | Simulates payment processing                  |
| `shipping-service` | Handles shipping & order delivery tracking    |
| `gateway-service`  | Optional WebSocket + API aggregation          |
| `common-lib`       | Shared Kafka events, DTOs, enums              |

---

## ⚙️ System Architecture

```plaintext
User → Cart → Order → Kafka → Inventory → Kafka → Payment → Kafka → Shipping

