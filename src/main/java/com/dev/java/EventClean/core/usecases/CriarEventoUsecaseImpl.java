package com.dev.java.EventClean.core.usecases;

import com.dev.java.EventClean.core.entities.Event;
import com.dev.java.EventClean.core.exceptions.DuplicateKeyException;
import com.dev.java.EventClean.core.gateway.EventGateway;
import java.util.List;
import java.util.Objects;

public class CriarEventoUsecaseImpl implements CriarEventoUsecase {

  private final EventGateway eventGateway;

  public CriarEventoUsecaseImpl(EventGateway eventGateway) {
    this.eventGateway = eventGateway;
  }

  @Override
  public Event execute(Event event) {
    List<Event> events = eventGateway.buscarEventos();

    events.forEach(evt -> {
      if (Objects.equals(evt.identificador(), event.identificador())) {
        throw new DuplicateKeyException("O identificador de ser único!");
      }
    });
    return eventGateway.criarEvento(event);
  }
}
