package com.example.service;

import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.eclipse.microprofile.reactive.messaging.Outgoing;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ServiceB {
    @Incoming("foo")
    @Outgoing("bar")
    public String methodB(String msg) {
        return msg + "、来自 Service B 的消息。";
    }

}
