package com.teshi.testdeployments.adapter.in.rest;

import com.teshi.testdeployments.domain.aggregate.MessageService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SpringRestService  implements RestService {

  private final MessageService messageService;

  @Override
  public String retrieveHelloMessage() {
    return messageService.buildMessage();
  }
}
