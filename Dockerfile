
FROM openjdk:21-oracle
MAINTAINER arieldc
EXPOSE 8080
COPY target/portfolio-0.0.1-SNAPSHOT.jar portfolio-0.0.1-SNAPSHOT.jar
ENTRYPOINT  ["java","-Dspring.profiles.active=prod","-jar","portfolio-0.0.1-SNAPSHOT.jar"]
