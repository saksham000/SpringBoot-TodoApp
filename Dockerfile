FROM maven:3-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.2-jdk-slim
COPY --from=build /target/todoapp-0.0.1-SNAPSHOT.jar todoapp.jar
EXPOSE 8080
ENTRYPOINT [ "JAVA","-jar", "todoapp.jar" ]