FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY . .
RUN chmod +x ./gradlew && ./gradlew :examples:producer-example:build -x test
CMD ["java", "-jar", "examples/producer-example/build/libs/producer-example.*.jar"]