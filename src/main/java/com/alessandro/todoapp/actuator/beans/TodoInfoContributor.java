package com.alessandro.todoapp.actuator.beans;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.context.annotation.Configuration;

/**
 * @author Alessandro Arosio - 09/02/2020 10:59
 */
@Configuration
public class TodoInfoContributor implements InfoContributor {

    @Override
    public void contribute(Info.Builder builder) {
        builder
                .withDetail("project_name", "To-do App")
                .withDetail("owner", "Alessandro Arosio")
                .withDetail("email", "-check-on-github-")
                .withDetail("github", "https://github.com/alessandroarosio")
                .build();
    }
}