package com.example.service;

import java.util.concurrent.CompletionStage;

import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ServiceA {
    @Inject
    @Channel("foo")
    private Emitter<String> emitter;

    public CompletionStage<Void> methodA() {
        return emitter.send("来自 Service A 的消息");
    }
}
