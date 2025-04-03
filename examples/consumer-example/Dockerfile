FROM eclipse-temurin:17-jdk
WORKDIR /app

COPY gradlew .
COPY gradle gradle
COPY settings.gradle .
COPY build.gradle .
COPY examples/consumer-example ./examples/consumer-example

WORKDIR /app/examples/consumer-example

RUN chmod +x /app/gradlew && /app/gradlew build -x test

CMD ["java", "-jar", "build/libs/consumer-example-*.jar"]
