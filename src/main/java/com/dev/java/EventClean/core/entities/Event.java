package com.dev.java.EventClean.core.entities;

import java.time.LocalDateTime;
import java.util.UUID;

public record Event(
    UUID id,
    String descricao,
    LocalDateTime inicio,
    LocalDateTime fim,
    String identificador,
    String local,
    Integer capacidade,
    String tipoEvento
) {}
