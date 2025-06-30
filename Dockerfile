FROM openjdk:17
WORKDIR /app
ARG JAR_FILE=build/libs/Logtest-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
RUN chmod 644 app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]