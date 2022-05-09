package com.teshi.testdeployments.boot.config;

import com.teshi.testdeployments.domain.aggregate.MessageService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AggregateConfig {

  @Bean
  public MessageService messageService() {
    return new MessageService();
  }
}
