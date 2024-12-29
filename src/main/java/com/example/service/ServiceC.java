package com.example.service;

import org.eclipse.microprofile.reactive.messaging.Incoming;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ServiceC {
    @Incoming("bar")
    public void methodC(String msg) {
        System.out.println("Service C 正在处理：" + msg);;
    }
}
