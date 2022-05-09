package com.teshi.testdeployments.boot.config;

import com.teshi.testdeployments.adapter.in.rest.SpringRestService;
import com.teshi.testdeployments.domain.aggregate.MessageService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RestConfig {

  @Bean
  public SpringRestService springRestService(MessageService messageService) {
    return new SpringRestService(messageService);
  }
}
