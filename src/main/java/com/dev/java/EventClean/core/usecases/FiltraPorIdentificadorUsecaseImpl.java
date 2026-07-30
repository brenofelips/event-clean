package com.dev.java.EventClean.core.usecases;

import com.dev.java.EventClean.core.entities.Event;
import com.dev.java.EventClean.core.exceptions.NotFoundIdentificadorException;
import com.dev.java.EventClean.core.gateway.EventGateway;

public class FiltraPorIdentificadorUsecaseImpl implements FiltraPorIdentificadorUsecase {
  private final EventGateway eventGateway;

  public FiltraPorIdentificadorUsecaseImpl(EventGateway eventGateway) {
    this.eventGateway = eventGateway;
  }

  @Override
  public Event execute(String identificador) {
    return eventGateway.buscarEventoPorIdentificador(identificador)
        .orElseThrow(() -> new NotFoundIdentificadorException(
            "Evento com identificador: " + identificador + " não foi encontrado"));
  }
}
