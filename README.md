> 🇰🇷 이 문서는 영어로 작성되었습니다. 한국어 버전은 [여기](README.ko.md)를 참고해주세요.
- [한국어](README.ko.md)

> This is an open-source project, and contributions are always welcome.
Feel free to submit issues, improve the code, or enhance the documentation!

[➡️ 기여 가이드 보기](.github/CONTRIBUTING.md)


## 📘 **Kafureka – Cloud-Native Kafka Discovery via Eureka**

### 🔧 What is Kafureka?

**Kafureka** is a cloud-native solution that bridges **Kafka** and **Eureka** by enabling dynamic service discovery of Kafka brokers using the Spring Cloud ecosystem.

It allows Kafka producers and consumers to automatically discover broker addresses via Eureka, removing the need for hardcoded `bootstrap-servers` and making your system more resilient and dynamic in modern infrastructure environments like Kubernetes or Docker.

---

### ✅ Core Features

#### 1. **Kafka Broker Registration to Eureka (Sidecar or Agent)**
- Kafka brokers are automatically registered as `KAFKA-BROKER` instances in Eureka.
- IP, port, and optional metadata (e.g., region, rack) can be included.
- Uses a lightweight Spring Boot sidecar application to handle registration.

#### 2. **Kafka Client Bootstrap Discovery via Eureka**
- Kafka producers/consumers dynamically fetch broker addresses from Eureka.
- No need to configure static `bootstrap-servers`.
- Enables fault-tolerant and auto-scaling-friendly client setup.

#### 3. **Spring Boot Integration with Auto-Configuration Support**
- Plug-and-play with `kafureka-spring-starter`.
- Use annotations like `@EnableKafkaDiscovery` to integrate easily.
- Fully compatible with Spring Kafka configurations.

#### 4. **Designed for Cloud-Native Environments**
- Perfect fit for Docker, Kubernetes, or any dynamic infrastructure.
- Kafka becomes part of your service discovery flow.
- Ready to extend to other discovery services (Consul, Zookeeper, etc.)

---

### 💡 Why Kafureka?

| Problem | Kafureka Solves |
|--------|------------------|
| Hardcoded Kafka broker addresses | Dynamic discovery via Eureka |
| Infrastructure changes require redeployments | Auto-adjusting client setup |
| Kafka operates outside of service discovery | Brings Kafka into the service mesh |
| Spring Cloud lacks Kafka discovery out-of-the-box | Provides seamless integration |

---

### 📦 Module Overview

| Module | Description |
|--------|-------------|
| `kafureka-core` | Core logic for resolving Kafka brokers via Eureka |
| `kafureka-spring-starter` | Spring Boot auto-configuration module |
| `kafureka-broker-sidecar` | Kafka broker registration sidecar |
| `examples/` | Sample projects: Producer, Consumer, Eureka Server, Kafka |

---

> **Kafureka = Lightweight, Cloud-Native Kafka Discovery via Spring Eureka**

---
