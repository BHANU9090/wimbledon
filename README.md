# 🎾 Wimbledon Finals API

A Spring Boot-based REST API to fetch Wimbledon Men's Singles final results by year.  

---

## 📌 Features

- ✅ Fetch match results by year using query parameter
- ✅ MySQL database integration
- ✅ Global exception handling (404, 400, 500)
- ✅ Clean layered architecture (Controller, Service, Repository)
- ✅ Video walkthrough attached for better understanding

---

## 🔧 Tech Stack

- **Java 17**
- **Spring Boot 3.2**
- **Spring Data JPA**
- **MySQL**
- **Gradle**

---

## 📂 API Endpoint

### `GET /wimbledon?year={year}`

Fetches the final match details for the given Wimbledon year.

#### ✅ Sample Request

```

GET [http://localhost:8080/wimbledon?year=2021](http://localhost:8080/wimbledon?year=2021)

````

#### ✅ Sample Success Response (`200 OK`)

```json
{
  "year": 2021,
  "champion": "Novak Djokovic",
  "runnerUp": "Matteo Berrettini",
  "score": "6–7(4–7), 6–4, 6–4, 6–3",
  "sets": 4,
  "tiebreak": true
}
````

#### ⚠️ Error Responses

**404 - Year Not Found**

```json
{
  "timestamp": "2025-07-04T23:50:30.479",
  "status": 404,
  "error": "Not Found",
  "message": "No Wimbledon final data found for year: 2025"
}
```

**400 - Missing or Invalid Parameter**

```json
{
  "timestamp": "2025-07-04T23:52:12.876",
  "status": 400,
  "error": "Bad Request",
  "message": "Missing required parameter: year"
}
```

---

## ▶️ Running Locally

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/wimbledon-api.git
cd wimbledon-api
```

### 2. Create MySQL Database

```sql
CREATE DATABASE wimbledon;
```

### 3. Configure `application.properties`

Update your DB credentials:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/wimbledon
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

### 4. Insert Sample Data

```sql
INSERT INTO wimbledon_result (year, champion, runner_up, score, sets, tiebreak) VALUES
(2021, 'Novak Djokovic', 'Matteo Berrettini', '6–7(4–7), 6–4, 6–4, 6–3', 4, TRUE),
(2022, 'Novak Djokovic', 'Nick Kyrgios', '4–6, 6–3, 6–4, 7–6(7–3)', 4, TRUE),
(2019, 'Novak Djokovic', 'Roger Federer', '7–6(7–5), 1–6, 7–6(7–4), 4–6, 13–12(7–3)', 5, TRUE),
(2018, 'Novak Djokovic', 'Kevin Anderson', '6–2, 6–2, 7–6(7–3)', 3, TRUE),
(2017, 'Roger Federer', 'Marin Čilić', '6–3, 6–1, 6–4', 3, FALSE);
```

### 5. Run the Application

```bash
./gradlew bootRun
```

---

## 🌐 Access the API

```
http://localhost:8080/wimbledon?year=2021
```

---

## 📽️ Video Walkthrough

Please refer to the attached video in mail for a complete walkthrough of the application, API behavior, and exception handling.

---

