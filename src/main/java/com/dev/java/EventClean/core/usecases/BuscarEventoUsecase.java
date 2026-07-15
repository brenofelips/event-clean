package com.dev.java.EventClean.core.usecases;

import com.dev.java.EventClean.core.entities.Event;
import java.util.List;

public interface BuscarEventoUsecase {
  List<Event> execute();
}
