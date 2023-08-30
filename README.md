Implementation
Each field is parsed individually by maintaining separate classes for each field in cron expression.

All of these classes extends base class FieldParser.

For each char type special validations checks are performed.

How to Run
Install maven 3.x and JDK 1.8.

To run unit test cases execute from the project root folder -

mvn clean test
To compile and create jar file execute from the project root folder -

mvn clean package
