> 이 프로젝트는 오픈소스이며, 누구나 자유롭게 기여하실 수 있습니다. 이슈 등록, 코드 수정, 문서 개선 등 어떤 형태의 참여도 환영합니다!

[➡️ 기여 가이드 보기](.github/CONTRIBUTING.md)

## 🧭 Kafureka가 제공하는 핵심 기능 (정의)

### 🔧 "Kafka와 Eureka를 연결해주는 Cloud-Native Discovery 솔루션"

`kafureka`는 **Kafka 클러스터와 Spring Cloud Eureka를 연동**시켜서,  
Kafka 브로커와 클라이언트 간의 연결을 **동적이고 자동화된 방식**으로 구성하게 해주는 툴킷이다.

---

## ✅ 주요 기능 요약

### 1. **Kafka 브로커를 Eureka에 등록 (Sidecar or Agent 방식)**
- Kafka 브로커 인스턴스가 Eureka에 `KAFKA-BROKER`로 등록됨
- IP, 포트, region 등의 메타데이터 포함 가능
- 별도 sidecar 애플리케이션이 브로커 옆에서 자동 등록 처리

### 2. **Kafka 클라이언트가 Eureka에서 브로커 정보 조회**
- `KafkaProducer`/`KafkaConsumer`가 직접 Eureka에서 브로커 주소를 가져옴
- `bootstrap-servers`를 하드코딩하지 않아도 됨
- Eureka를 통한 **동적 브로커 디스커버리** 구현

### 3. **Spring Boot 환경에 쉽게 통합 가능**
- `kafureka-spring-starter`를 통해 자동 구성 지원
- `@EnableKafkaDiscovery` 등으로 간편하게 적용
- 기존 Spring Kafka 설정 방식과 호환됨

### 4. **Cloud-Native 환경에 적합한 확장성**
- Kubernetes, Docker 등 유동적인 인프라에 대응
- Eureka만 설정되어 있으면 Kafka 연결도 자동 구성
- Config Server, Consul 등 다른 디스커버리 시스템 확장 가능성 있음

---

## 💡 핵심 가치 (왜 필요한가?)

| 기존 방식 문제 | Kafureka가 해결하는 방식 |
|----------------|-------------------------|
| Kafka 주소를 매번 하드코딩해야 함 | Eureka에서 동적 조회 |
| 브로커 인프라가 변경되면 설정 변경/재배포 필요 | 자동 감지 및 재연결 가능 |
| Kafka 자체는 서비스 디스커버리와 별개로 동작함 | Kafka도 마이크로서비스 네트워크에 통합 |
| Spring Cloud MSA와 Kafka 사이의 단절 | 자연스러운 통합 제공 |

---

## 📦 구성 모듈 아이디어

| 모듈명 | 기능 |
|--------|------|
| `kafureka-core` | Kafka 브로커 조회 로직 (Eureka 연동 핵심) |
| `kafureka-spring-starter` | Spring Boot에서 자동 구성 지원 |
| `kafureka-broker-sidecar` | Kafka 브로커를 Eureka에 등록하는 애플리케이션 |
| `examples/` | Producer, Consumer, Eureka, Kafka 예제 환경 제공 |

---

## 🚀 한 줄 요약

> **Kafureka = Eureka 기반 Kafka 브로커 디스커버리 솔루션 for Cloud-Native MSA**

---
