# Book Management REST API

A RESTful backend application built using **Java and Spring Boot** to manage book records. The application provides CRUD (Create, Read, Update, Delete) operations through HTTP endpoints and can serve as a foundation for a library management system.

## Tech Stack

- **Language:** Java 17
- **Framework:** Spring Boot 4.1.2
- **Build Tool:** Maven
- **Backend:** Spring Web
- **Storage:** Java ArrayList (in-memory)
- **API Testing:** Postman

## Features

- Add new books with title and author details.
- Retrieve all available books.
- Retrieve an individual book using its ID.
- Update existing book information.
- Delete books using their IDs.
- Handle HTTP responses using Spring's `ResponseEntity`.
- Return appropriate HTTP status codes for successful and unsuccessful requests.

## Project Structure

```text
booksapi/
├── src/
│   ├── main/
│   │   ├── java/com/hasna/booksapi/
│   │   │   ├── Book.java
│   │   │   ├── BookController.java
│   │   │   ├── BookService.java
│   │   │   ├── BooksapiApplication.java
│   │   │   └── HelloController.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
├── .mvn/
├── mvnw
├── mvnw.cmd
└── pom.xml
```

## API Endpoints

Base URL: `http://localhost:8080`

| HTTP Method | Endpoint | Description |
|---|---|---|
| POST | `/books` | Add a new book |
| GET | `/books` | Retrieve all books |
| GET | `/books/{id}` | Retrieve a book by ID |
| PUT | `/books/{id}` | Update an existing book |
| DELETE | `/books/{id}` | Delete a book |

### Example Request

**POST /books**

```json
{
  "title": "Java Basics",
  "author": "Hasna"
}
```

**Example Response:**

```json
{
  "id": 1,
  "title": "Java Basics",
  "author": "Hasna"
}
```

## HTTP Status Codes

| Status Code | Description |
|---|---|
| 200 OK | Request completed successfully |
| 201 Created | Book successfully created |
| 204 No Content | Book successfully deleted |
| 404 Not Found | Requested book does not exist |

## Running the Application

**Prerequisites:**
- Java JDK 17
- Git

**Steps:**

1. Clone the repository:

```bash
git clone https://github.com/Hasnakadeeja/booksapi-springboot.git
```

2. Navigate to the project directory:

```bash
cd booksapi-springboot
```

3. Run the application using Maven Wrapper:

Windows:

```powershell
.\mvnw.cmd spring-boot:run
```

4. The application will start at:

```text
http://localhost:8080
```

## Testing

All CRUD endpoints were tested using **Postman** to verify request handling, data operations, and HTTP response status codes.

## Current Limitations

- Book records are stored in an in-memory ArrayList.
- Data is lost when the application is restarted.
- Database persistence is not implemented yet.

## Future Improvements

- Integrate MySQL for persistent data storage.
- Implement Spring Data JPA.
- Add input validation and exception handling.
- Implement unit and integration tests.

---

**Author:** Hasna Kadeeja  
**GitHub:** [Hasnakadeeja](https://github.com/Hasnakadeeja)
