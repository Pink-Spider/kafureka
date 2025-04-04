FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY . .
RUN chmod +x ./gradlew && ./gradlew :examples:consumer-example:build -x test
CMD ["java", "-jar", "examples/consumer-example/build/libs/consumer-example.*.jar"]