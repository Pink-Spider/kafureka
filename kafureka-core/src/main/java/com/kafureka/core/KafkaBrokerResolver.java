package com.kafureka.core;

import com.netflix.discovery.EurekaClient;

import java.util.List;
import java.util.stream.Collectors;

public class KafkaBrokerResolver {
    private final EurekaClient eurekaClient;
    private final String serviceName;

    public KafkaBrokerResolver(EurekaClient eurekaClient, String serviceName) {
        this.eurekaClient = eurekaClient;
        this.serviceName = serviceName;
    }

    public List<String> resolveBootstrapServers() {
        return eurekaClient.getApplication(serviceName)
                .getInstances()
                .stream()
                .map(instance -> instance.getIPAddr() + ":" + instance.getPort())
                .collect(Collectors.toList());
    }
}