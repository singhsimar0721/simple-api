FROM openjdk:8
WORKDIR /usr/src/myapp
COPY target/simple-api-0.0.1-SNAPSHOT.jar .
ENTRYPOINT ["java", "-jar", "simple-api-0.0.1-SNAPSHOT.jar"]