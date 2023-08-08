# CollegeDatabase
Java Maven Project created to practice interfacing with a mySQL DB using Java packages

![College Database Functions](https://github.com/sudhirv1/CollegeDatabase/blob/fba4aaad79004efe8976aa3288afcc0b824bb1c4/College-Db.jpg)

```markdown
# College Database

This Java Maven project provides a set of functions to connect to a MySQL database and manage student information for a college. It supports operations like insertion, deletion, editing of student records, and also handles errors such as duplicate entries. The project allows you to view the current students' information through the Command Line Interface (CLI).

## Features

- Connects to a MySQL database to store and manage student information.
- Supports insertion, deletion, and editing of student records.
- Handles errors gracefully, including duplicate entries.
- Provides CLI interface to interact with the system and view current student records.

## Prerequisites

- Java JDK (8 or higher)
- Maven
- MySQL Server

## Getting Started

1. Clone this repository to your local machine.
2. Create a MySQL database named 'college_management'.
3. Update the MySQL database connection details in the `src/main/resources/application.properties` file.
4. Build the project using Maven:
5. Run the application:
   java -jar target/college-management.jar
   ```

## Usage

1. Run the application as described in the "Getting Started" section.
2. Follow the CLI prompts to perform operations:
   - Choose an option to insert, delete, or edit student information.
   - Provide necessary details like name, course, and address.
   - The application will handle any errors, including duplicate entries.
   - You can also view the current students' information.

## Contributing

Contributions are welcome! If you find a bug or have a suggestion, please open an issue or submit a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](https://www.mit.edu/~amini/LICENSE.md) file for details.
