package com.dev.java.EventClean.infra.presentation;

import com.dev.java.EventClean.core.entities.Event;
import com.dev.java.EventClean.core.usecases.BuscarEventoUsecase;
import com.dev.java.EventClean.core.usecases.CriarEventoUsecase;
import com.dev.java.EventClean.core.usecases.FiltraPorIdentificadorUsecase;
import com.dev.java.EventClean.infra.dtos.EventDto;
import com.dev.java.EventClean.infra.mapper.EventDtoMapper;
import java.util.List;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/")
public class EventController {
  private final CriarEventoUsecase criarEventoUsecase;
  private final BuscarEventoUsecase buscarEventoUsecase;
  private final FiltraPorIdentificadorUsecase filtraPorIdentificadorUsecase;
  private final EventDtoMapper mapper;

  @PostMapping("criar-evento")
  public ResponseEntity<Map<String, Object>> criarEvento(@RequestBody EventDto dto) {
    Event newEvent = criarEventoUsecase.execute(mapper.toEntity(dto));
    Map<String, Object> response = Map.of("message", "Evento criado com sucesso!", "data", newEvent);
    return ResponseEntity.ok(response);
  }

  @GetMapping("buscar-eventos")
  public List<EventDto> buscarEventos() {
    List<Event> events = buscarEventoUsecase.execute();
    return mapper.toDto(events);
  }

  @GetMapping("buscar-evento-by-identificador/{identificador}")
  public EventDto buscarEventoPorIdentificador(@PathVariable String identificador) {
    Event event = filtraPorIdentificadorUsecase.execute(identificador);
    return mapper.toDto(event);
  }
}
