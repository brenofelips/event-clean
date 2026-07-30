package com.dev.java.EventClean.core.gateway;

import com.dev.java.EventClean.core.entities.Event;
import java.util.List;
import java.util.Optional;

public interface EventGateway {
  Event criarEvento(Event event);
  List<Event> buscarEventos();
  Optional<Event> buscarEventoPorIdentificador(String identificador);
}
