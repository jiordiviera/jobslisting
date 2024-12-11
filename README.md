
# Getting Started with the JobsListing Project

This documentation provides clear steps to set up and run the **JobsListing** project locally.

---

## Prerequisites

Ensure the following are installed on your machine before beginning:

1. **Java Development Kit (JDK)** – Version 17
2. **Maven** – To build the project
3. **MongoDB** – A running MongoDB server OR a cloud MongoDB connection string.
4. **Git** – To clone the repository (if not already cloned)

---

## Steps to Start the Project

### 1. Clone the Repository
If you haven't already done so, clone the repository from your version control system (e.g., Git).

```bash
git clone https://github.com/jiordiviera/jobslisting
```


---

### 2. Navigate to the Project Directory
Change your working directory to the project folder:

```bash
cd jobslisting
```

---

### 3. Set up Environment Variables
The project uses a `.env` file for environment configuration.

1. **Copy the Example `.env` File:**
   Create a `.env` file by copying the `.env.example` file provided in the project.

   ```bash
   cp .env.example .env
   ```

2. **Edit the `.env` File:**
   Open the `.env` file in a text editor of your choice and configure it:

   - Set `APP_NAME` to your desired application name.
   - Set `MONGO_URI` to your MongoDB connection string.

   Example:
   ```dotenv
   APP_NAME=jobslisting
   MONGO_URI=mongodb+srv://<username>:<password>@<cluster>.mongodb.net/?retryWrites=true&w=majority&appName=joblisting
   ```

   Replace `<username>`, `<password>`, and `<cluster>` with your MongoDB credentials.

---

### 4. Build the Project
Build the project using Maven:

```bash
mvn clean install
```

This command will compile the project, resolve dependencies, and package it.

---

### 5. Run the Application
Start the Spring Boot application using Maven:

```bash
mvn spring-boot:run
```

Alternatively, you can run the packaged JAR file after success:

```bash
java -jar target/jobslisting-0.0.1-SNAPSHOT.jar
```

---

### 6. Verify the Application
Once the application is running, you can access it using the default port (usually **8080**) in your browser or using an API testing tool like Postman.

Example:
```text
http://localhost:8080
```

Ensure the application is properly connected to the MongoDB instance.

---

## Troubleshooting

1. **Environment Variables Not Found**  
   Ensure `.env` is properly configured, and the `dotenv` dependency is present in your `pom.xml`.

2. **MongoDB Connection Errors**  
   Verify the `MONGO_URI` connection string in `.env`. Ensure MongoDB is running or accessible.

3. **Port Conflicts**  
   If port **8080** is already in use, modify the default server port in `application.properties` or add this variable in the `.env` file:

   ```properties
   SERVER_PORT=8081
   ```

4. **Dependency Issues**  
   Run the following command to force update the dependencies:

   ```bash
   mvn clean install -U
   ```

---

## Additional Information

- **Framework**: Built on **Spring Boot**
- **Database**: Uses MongoDB as its primary database
- **Key Tool**: Utilizes `dotenv` for managing environment variables.

Feel free to extend or reach out for support if you need further assistance. Enjoy coding! 🚀
