package com.kafureka.spring.annotation;

import org.springframework.context.annotation.Import;
import com.kafureka.spring.KafurekaAutoConfiguration;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(KafurekaAutoConfiguration.class)
public @interface EnableKafkaDiscovery {
}