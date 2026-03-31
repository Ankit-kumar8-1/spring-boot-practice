package com.SpringBoot.Practice.Test;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class DataBasesService {

    public DataBasesService() {
        System.out.println("1. Constructor chala — Object ban gaya!");
    }

    @PostConstruct
    public void init() {
        System.out.println("2. @PostConstruct chala — Initialization complete!");
    }

    public void queryDatabase() {
        System.out.println("3. queryDatabase() chala — Database se data fetch kar raha hai...");
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("4. @PreDestroy chala — Cleanup complete, resources released!");
    }
}
