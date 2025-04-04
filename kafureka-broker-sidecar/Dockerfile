FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY . .
RUN ./gradlew clean build -x test
CMD ["java", "-jar", "build/libs/kafureka-broker-sidecar-0.1.0.jar"]