package com.dev.java.EventClean.infra.beans;

import com.dev.java.EventClean.core.gateway.EventGateway;
import com.dev.java.EventClean.core.usecases.BuscarEventoUsecase;
import com.dev.java.EventClean.core.usecases.BuscarEventoUsecaseImpl;
import com.dev.java.EventClean.core.usecases.CriarEventoUsecase;
import com.dev.java.EventClean.core.usecases.CriarEventoUsecaseImpl;
import com.dev.java.EventClean.core.usecases.FiltraPorIdentificadorUsecase;
import com.dev.java.EventClean.core.usecases.FiltraPorIdentificadorUsecaseImpl;
import com.dev.java.EventClean.core.services.IdentificadorGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
  // @Bean traz o criarEventoUsecase para o contexto do Spring. PS: faz o mesmo para as outras classes anotadas com @Bean
  @Bean
  public CriarEventoUsecase criarEventoUsecase(EventGateway eventGateway, IdentificadorGenerator identificadorGenerator) {
    return new CriarEventoUsecaseImpl(eventGateway, identificadorGenerator);
  }

  @Bean
  public BuscarEventoUsecase buscarEventoUsecase(EventGateway eventGateway) {
    return new BuscarEventoUsecaseImpl(eventGateway);
  }

  @Bean
  public FiltraPorIdentificadorUsecase filtraPorIdentificadorUsecase(EventGateway eventGateway) {
    return new FiltraPorIdentificadorUsecaseImpl(eventGateway);
  }
}
