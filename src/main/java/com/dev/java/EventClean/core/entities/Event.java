package com.dev.java.EventClean.core.entities;

import com.dev.java.EventClean.core.enums.TipoEvento;
import java.time.LocalDateTime;

public record Event(Long id,
                    String descricao,
                    String identificador,
                    LocalDateTime inicio,
                    LocalDateTime fim,
                    String localEvento,
                    Integer capacidade,
                    String organizador,
                    TipoEvento tipoEvento
) {}
