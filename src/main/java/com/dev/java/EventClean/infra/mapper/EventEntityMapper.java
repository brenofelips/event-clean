package com.dev.java.EventClean.infra.mapper;

import com.dev.java.EventClean.core.entities.Event;
import com.dev.java.EventClean.infra.persistence.EventEntity;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class EventEntityMapper {

  public EventEntity toEntity(Event event) {
    return new EventEntity(
        event.id(),
        event.nome(),
        event.descricao(),
        event.identificador(),
        event.dataInicio(),
        event.dataFim(),
        event.localEvento(),
        event.capacidade(),
        event.organizador(),
        event.tipoEvento()
    );
  }

  public Event toDomain(EventEntity eventEntity) {
    return new Event(
        eventEntity.getId(),
        eventEntity.getNome(),
        eventEntity.getDescricao(),
        eventEntity.getIdentificador(),
        eventEntity.getDataInicio(),
        eventEntity.getDataFim(),
        eventEntity.getLocalEvento(),
        eventEntity.getCapacidade(),
        eventEntity.getOrganizador(),
        eventEntity.getTipoEvento()
    );
  }

  public List<Event> toDomain(List<EventEntity> eventEntityList) {
    return eventEntityList.stream().map(this::toDomain).toList();
  }
}
