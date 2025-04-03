FROM eclipse-temurin:17-jdk
WORKDIR /app

COPY gradlew .
COPY gradle gradle
COPY settings.gradle .
COPY build.gradle .
COPY examples/producer-example ./examples/producer-example

WORKDIR /app/examples/producer-example

RUN chmod +x /app/gradlew && /app/gradlew build -x test

CMD ["java", "-jar", "build/libs/producer-example-*.jar"]
