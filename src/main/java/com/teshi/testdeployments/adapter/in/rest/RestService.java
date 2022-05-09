package com.teshi.testdeployments.adapter.in.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface RestService {

  @ResponseBody
  @GetMapping("/hi")
  String retrieveHelloMessage();

}
