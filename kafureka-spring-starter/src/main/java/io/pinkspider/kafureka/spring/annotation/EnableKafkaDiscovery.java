package io.pinkspider.kafureka.spring.annotation;

import io.pinkspider.kafureka.spring.config.KafurekaAutoConfiguration;
import org.springframework.context.annotation.Import;
import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(KafurekaAutoConfiguration.class)
public @interface EnableKafkaDiscovery {

}
