package com.dev.java.EventClean.core.usecases;

import com.dev.java.EventClean.core.entities.Event;
import com.dev.java.EventClean.core.exceptions.DuplicateKeyException;
import com.dev.java.EventClean.core.gateway.EventGateway;
import com.dev.java.EventClean.core.services.IdentificadorGenerator;
import java.util.List;
import java.util.Objects;

public class CriarEventoUsecaseImpl implements CriarEventoUsecase {

  private final EventGateway eventGateway;
  private final IdentificadorGenerator identificadorGenerator;

  public CriarEventoUsecaseImpl(EventGateway eventGateway, IdentificadorGenerator identificadorGenerator) {
    this.eventGateway = eventGateway;
    this.identificadorGenerator = identificadorGenerator;
  }

  @Override
  public Event execute(Event event) {
    List<Event> events = eventGateway.buscarEventos();
    checkIdentificadorEventoDuplicado(events, event);
    Event eventWithRandom = new Event(event.id(), event.nome(), event.descricao(),
        identificadorGenerator.generate(), event.dataInicio(), event.dataFim(),
        event.localEvento(), event.capacidade(), event.organizador(), event.tipoEvento());
    return eventGateway.criarEvento(eventWithRandom);
  }

  private void checkIdentificadorEventoDuplicado(List<Event> events, Event eventSend) {
    events.forEach(evt -> {
      if (Objects.equals(evt.identificador(), eventSend.identificador())) {
        throw new DuplicateKeyException("O identificador " + eventSend.identificador() + " já está em uso.");
      }
    });
  }
}
