FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY . .
RUN chmod +x ./gradlew && ./gradlew :examples:eureka-server:build -x test
CMD ["java", "-jar", "examples/eureka-server/build/libs/eureka-server.*.jar"]