```markdown
# Expense Tracker Application

This Expense Tracker application is built using Java, Spring Boot, Docker, Kafka, and Linux. It consists of two main services: AuthService and UserService.

## AuthService
- Handles creation and validation of RefreshTokens and JWT tokens.
- Utilizes repositories to store tokens and user data in a MySQL database.
- Acts as a Kafka producer by pushing serialized user data.
  
## UserService
- Deserializes the user data received from Kafka and stores it in the database.

## Technologies Used
- Java
- Spring Boot
- Docker
- Postman
- Kafka
- Linux

## Deployment
- Both AuthService and UserService instances are deployed on an Ubuntu server acting as a Virtual Private Server (VPS).
- Kafka and MySQL are containerized and run as Docker containers on the Ubuntu server.

## Setup Instructions
1. Clone the repository.
2. If using Mac, install Parallels Desktop and set up a virtual machine with Ubuntu installed on it.
3. Install Docker on the virtual machine created using Parallels.
4. Build the Docker images for Kafka, MySQL, AuthService, and UserService.
5. Initialize the containers using Docker Compose.
6. Run the Spring Boot applications for AuthService and UserService.
7. Send user data through Postman by hitting the APIs.
## Contributing
Contributions are welcome. Please feel free to submit pull requests or open issues if you encounter any problems.

## License
This project is licensed under the [MIT License](LICENSE).
```
