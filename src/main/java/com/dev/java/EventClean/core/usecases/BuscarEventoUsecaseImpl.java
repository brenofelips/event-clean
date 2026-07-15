package com.dev.java.EventClean.core.usecases;

import com.dev.java.EventClean.core.entities.Event;
import com.dev.java.EventClean.core.gateway.EventGateway;
import java.util.List;

public class BuscarEventoUsecaseImpl implements BuscarEventoUsecase {

  private final EventGateway eventGateway;

  public BuscarEventoUsecaseImpl(EventGateway eventGateway) {
    this.eventGateway = eventGateway;
  }

  @Override // Essa annotation é nativa do Java
  public List<Event> execute() {
    return eventGateway.buscarEventos();
  }
}
