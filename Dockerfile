FROM openjdk:latest
COPY ./target/semdemo-0.1.0.2-jar-with-dependencies.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "semdemo-0.1.0.2-jar-with-dependencies.jar"]