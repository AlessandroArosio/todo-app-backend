package com.alessandro.todoapp.actuator.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.actuate.health.Status;
import org.springframework.stereotype.Component;

/**
 * @author Alessandro Arosio - 09/02/2020 10:50
 */
@Component
public class MaxMemoryHealthIndicator implements HealthIndicator {
    private static final long hundredMb = 100L * 1024L * 1024L;

    @Override
    public Health health() {
        boolean invalid = Runtime.getRuntime().maxMemory() < hundredMb;
        Status status = invalid ? Status.DOWN : Status.UP;
        return Health.status(status).build();
    }
}
