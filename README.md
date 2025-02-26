## README ###

loadtesting application

This application acts as a Listnere to RabbitMQ rquests sent for processing.
It process the request with a delay of 2 seconds and calls a webhook end point to update the status of the request.

Steps to build the application:

1. Clone the application code from this location :
2. Build the Project from application directory using below command
   ./request-processor> ./gradlew clean build -x test
   Above command will generated the JAR File at ./request-processor/build/libs directory.
3. Execute the JAR to run the application. Use beow command:
   java -jar ./request-processor/build/libs/request-processor-0.0.1-SNAPSHOT.jar
