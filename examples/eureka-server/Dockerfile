FROM eclipse-temurin:17-jdk
WORKDIR /app

COPY gradlew .
COPY gradle gradle
COPY settings.gradle .
COPY build.gradle .
COPY examples/eureka-server ./examples/eureka-server

WORKDIR /app/examples/eureka-server

RUN chmod +x /app/gradlew && /app/gradlew build -x test

CMD ["java", "-jar", "build/libs/eureka-server-*.jar"]
