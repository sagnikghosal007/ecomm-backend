# 🛒 E-Commerce Backend API (Spring Boot)

This is a **RESTful backend API** for a basic E-commerce application built using **Spring Boot**, supporting **user authentication**, **product management**, and **order processing**.

---

## 🚀 Features

- ✅ User Registration & Login
- 📦 Product Listing, Retrieval, Addition & Deletion
- 🧾 Order Placement & Viewing by User
- ❌ Order Deletion (Admin or user)
- 📡 CORS enabled for frontend integration
- 🔒 Basic exception handling and validations

---

## 📁 Project Structure

```
com.saggy.ecomm_backend
│
├── controller        # REST controllers for Users, Products, and Orders
├── dto              # Data Transfer Objects for Order & Order Items
├── model            # Entity classes (User, Product, Orders, OrderItem)
├── repo             # Spring Data JPA Repositories
└── service          # Business logic for all operations
```

---

## 🧠 API Overview

### 🔐 User APIs

| Method | Endpoint         | Description          |
|--------|------------------|----------------------|
| POST   | `/users/register` | Register new user    |
| POST   | `/users/login`    | Login with email & password |
| GET    | `/users`          | Fetch all users      |

---

### 📦 Product APIs

| Method | Endpoint         | Description          |
|--------|------------------|----------------------|
| GET    | `/products`       | Get all products     |
| GET    | `/products/{id}`  | Get product by ID    |
| POST   | `/products`       | Add new product      |
| DELETE | `/products/{id}`  | Delete product       |

---

### 🧾 Order APIs

| Method   | Endpoint                | Description                          |
|----------|-------------------------|--------------------------------------|
| POST     | `/orders/place/{userId}` | Place an order                       |
| GET      | `/orders/all-orders`     | View all orders                      |
| GET      | `/orders/user/{userId}`  | View orders placed by a specific user|
| DELETE   | `/orders/delete/{orderId}` | Delete order by ID                 |

---

## 🔧 Tech Stack

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 / MySQL (for DB)
- Lombok (optional)
- CORS (Cross-Origin enabled for frontend)

---

## 📌 How to Run

1. **Clone the Repository**
   ```bash
   git clone https://github.com/yourusername/ecomm_backend.git
   cd ecomm_backend
   ```

2. **Open in IntelliJ / Eclipse / VS Code**

3. **Configure application.properties**
   Example:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/ecomm_db
   spring.datasource.username=root
   spring.datasource.password=yourpassword
   spring.jpa.hibernate.ddl-auto=update
   ```

4. **Run the application**
   Run `EcommBackendApplication.java` from your IDE or use:
   ```bash
   mvn spring-boot:run
   ```

---

## 📬 Sample JSON Payloads

### ➕ Register User
```json
POST /users/register
{
  "name": "John Doe",
  "email": "john@example.com",
  "password": "1234"
}
```

### 🛒 Place Order
```json
POST /orders/place/1
{
  "productQuantities": {
    "101": 2,
    "102": 1
  },
  "totalAmount": 1500.0
}
```

---

## 📎 To Do (Suggestions)
- Add JWT Authentication
- Admin Role for Product Management
- Payment Gateway Integration (Razorpay/Stripe)
- Pagination for product list
- Dockerize the app

---

## 👨‍💻 Author

**Sagnik Ghosal**  
Java Full Stack Developer | Passionate about scalable backend systems

---

## ⭐️ Show Your Support

If you found this project useful, give it a ⭐️ on GitHub and consider contributing!
