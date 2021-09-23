FROM openjdk:14-jdk-alpine
ADD pom.xml ./
ADD target/notification-service.0.0.1-SNAPSHOT.jar notification-service.0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "notification-service.0.0.1-SNAPSHOT.jar"]
VOLUME /dev/student
EXPOSE 8081
