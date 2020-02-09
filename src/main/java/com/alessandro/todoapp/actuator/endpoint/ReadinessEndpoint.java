package com.alessandro.todoapp.actuator.endpoint;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author Alessandro Arosio - 09/02/2020 10:51
 */
@Component
@Endpoint(id = "readiness")
public class ReadinessEndpoint {
    private String ready = "NOT_READY";

    @ReadOperation
    public String getReadiness() {
        return ready;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void setReady() {
        ready = "Application is ready";
    }
}
