package com.yyzhai.consumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name= "spring-cloud-producer")
public interface IUserRemoteService {

    @RequestMapping(value = "/user/{name}")
    public String get(@PathVariable("name") String name);
}
