
FROM openjdk:21-ea-11-slim-buster
MAINTAINER arieldc
COPY target/portfolio-0.0.1-SNAPSHOT.jar portfolio-0.0.1-SNAPSHOT.jar
ENTRYPOINT  ["java","-Dspring.profiles.active=prod","-jar","portfolio-0.0.1-SNAPSHOT.jar"]
