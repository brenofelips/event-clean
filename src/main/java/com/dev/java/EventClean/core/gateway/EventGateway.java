package com.dev.java.EventClean.core.gateway;

import com.dev.java.EventClean.core.entities.Event;
import java.util.List;

public interface EventGateway {
  Event criarEvento(Event event);
  List<Event> buscarEventos();
  Event buscarEventoPorIdentificador(String identificador);
}
