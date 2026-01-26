package com.dev.java.EventClean.core.usecases;

import com.dev.java.EventClean.core.entities.Event;

public class criarEventoCaseImpl implements criarEventoCase {

  @Override
  public Event execute(Event event) {
    return event;
  }
}
