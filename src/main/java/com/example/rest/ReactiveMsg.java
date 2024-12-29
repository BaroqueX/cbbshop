package com.example.rest;

import com.example.service.ServiceA;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/msg")
public class ReactiveMsg {
    @Inject
    ServiceA serviceA;

    @GET
    public void getMsg() {
        serviceA.methodA();
    }

}
