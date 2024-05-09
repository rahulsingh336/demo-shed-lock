# Spring Boot ShedLock Demo

This is a simple demonstration of using ShedLock with Spring Boot version 3.x. ShedLock is a distributed lock library for Java that works with several lock providers to provide distributed lock mechanisms.

## Prerequisites

- Java 21 or higher installed
- Maven 3.x or higher installed

## Setup

1. Clone this repository:


2. Navigate to the project directory:
  cd spring-boot-shedlock-demo


## Running the Application

### Using Default Profile

To run the application with the default profile, use the following command:
mvn spring-boot:run

### Using Second Profile

To run the application with the second profile, use the following command:
mvn spring-boot:run -Dspring-boot.run.profiles=second


## Configuration

The ShedLock configuration is defined in the `application.yml` file. You can modify the configuration based on your requirements.

## Dependencies

- Spring Boot 3.x
- ShedLock
- Other dependencies as specified in the `pom.xml` file

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvement, feel free to open an issue or create a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
