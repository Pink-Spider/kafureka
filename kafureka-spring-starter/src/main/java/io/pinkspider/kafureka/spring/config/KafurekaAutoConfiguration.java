package io.pinkspider.kafureka.spring.config;

import io.pinkspider.kafureka.core.KafkaBrokerResolver;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(prefix = "kafureka", name = "enabled", havingValue = "true", matchIfMissing = true)
public class KafurekaAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public KafkaBrokerResolver kafkaBrokerResolver(EurekaClient eurekaClient,
                                                    @Value("${kafureka.service-name:KAFKA-BROKER}") String serviceName) {
        return new KafkaBrokerResolver(eurekaClient, serviceName);
    }
}