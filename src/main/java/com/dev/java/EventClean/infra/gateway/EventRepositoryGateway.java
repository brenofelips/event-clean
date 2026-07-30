package com.dev.java.EventClean.infra.gateway;

import com.dev.java.EventClean.core.entities.Event;
import com.dev.java.EventClean.core.gateway.EventGateway;
import com.dev.java.EventClean.infra.mapper.EventEntityMapper;
import com.dev.java.EventClean.infra.persistence.EventEntity;
import com.dev.java.EventClean.infra.persistence.EventReporsitory;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Component;

@Component
public class EventRepositoryGateway implements EventGateway {

  // Injeção de dependência
  private final EventReporsitory eventReporsitory;
  private final EventEntityMapper mapper;

  public EventRepositoryGateway(EventReporsitory eventReporsitory, EventEntityMapper mapper) {
    this.eventReporsitory = eventReporsitory;
    this.mapper = mapper;
  }

  @Override
  public Event criarEvento(Event event) {
    EventEntity eventEntity = eventReporsitory.save(mapper.toEntity(event));
    return mapper.toDomain(eventEntity);
  }

  @Override
  public List<Event> buscarEventos() {
    List<EventEntity> eventEntityList = eventReporsitory.findAll();
    return mapper.toDomain(eventEntityList);
  }

  @Override
  public Optional<Event> buscarEventoPorIdentificador(String identificador) {
    return Optional.ofNullable(eventReporsitory.findAllByIdentificador(identificador));
  }
}
