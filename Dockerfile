
FROM openjdk:21-oracle
MAINTAINER arieldc
COPY target/portfolio-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT  ["java","-Dspring.profiles.active=prod","-jar","/app.jar"]
