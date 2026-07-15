package com.dev.java.EventClean.core.usecases;

import com.dev.java.EventClean.core.entities.Event;
import com.dev.java.EventClean.core.gateway.EventGateway;

public class CriarEventoUsecaseImpl implements CriarEventoUsecase {

  private final EventGateway eventGateway;

  public CriarEventoUsecaseImpl(EventGateway eventGateway) {
    this.eventGateway = eventGateway;
  }

  @Override
  public Event execute(Event event) {
    return eventGateway.criarEvento(event);
  }
}
