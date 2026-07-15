package com.dev.java.EventClean.infra.mapper;

import com.dev.java.EventClean.core.entities.Event;
import com.dev.java.EventClean.infra.dtos.EventDto;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class EventDtoMapper {

  public EventDto toDto(Event entity) {
    return new EventDto(
        entity.id(),
        entity.nome(),
        entity.descricao(),
        entity.identificador(),
        entity.dataInicio(),
        entity.dataFim(),
        entity.localEvento(),
        entity.capacidade(),
        entity.organizador(),
        entity.tipoEvento()
    );
  }

  public List<EventDto> toDto(List<Event> eventList) {
    return eventList.stream().map(this::toDto).toList();
  }

  public Event toEntity(EventDto dto) {
    return new Event(
        dto.id(),
        dto.nome(),
        dto.descricao(),
        dto.identificador(),
        dto.dataInicio(),
        dto.dataFim(),
        dto.localEvento(),
        dto.capacidade(),
        dto.organizador(),
        dto.tipoEvento()
    );
  }
}
