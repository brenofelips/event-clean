package com.dev.java.EventClean.core.entities;

import com.dev.java.EventClean.core.enums.TipoEvento;
import java.time.LocalDateTime;
import java.util.UUID;

public record Event(UUID id,
                    String descricao,
                    String identificador,
                    LocalDateTime inicio,
                    LocalDateTime fim,
                    String local,
                    Integer capacidade,
                    TipoEvento tipoEvento
) {}
