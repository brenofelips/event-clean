package com.dev.java.EventClean.core.usecases;

import com.dev.java.EventClean.core.entities.Event;

public interface buscarEventoCase {
  Event execute(Long id);
}
