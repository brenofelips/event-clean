package com.dev.java.EventClean.infra.persistence;

import com.dev.java.EventClean.core.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventReporsitory extends JpaRepository<EventEntity, Long> {
  Event findAllByIdentificador(String identificador);
}
