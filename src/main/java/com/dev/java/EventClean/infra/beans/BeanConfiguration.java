package com.dev.java.EventClean.infra.beans;

import com.dev.java.EventClean.core.gateway.EventGateway;
import com.dev.java.EventClean.core.usecases.BuscarEventoUsecase;
import com.dev.java.EventClean.core.usecases.BuscarEventoUsecaseImpl;
import com.dev.java.EventClean.core.usecases.CriarEventoUsecase;
import com.dev.java.EventClean.core.usecases.CriarEventoUsecaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
  // @Bean traz o criarEventoUsecase para o contexto do Spring. PS: faz o mesmo para as outras classes anotadas com @Bean
  @Bean
  public CriarEventoUsecase criarEventoUsecase(EventGateway eventGateway) {
    return new CriarEventoUsecaseImpl(eventGateway);
  }

  @Bean
  public BuscarEventoUsecase buscarEventoUsecase(EventGateway eventGateway) {
    return new BuscarEventoUsecaseImpl(eventGateway);
  }
}
