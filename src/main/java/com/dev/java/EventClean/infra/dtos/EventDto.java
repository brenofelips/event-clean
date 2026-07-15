package com.dev.java.EventClean.infra.dtos;

import com.dev.java.EventClean.core.enums.TipoEvento;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import java.time.LocalDateTime;

public record EventDto(
    Long id,
    String nome,
    String descricao,
    String identificador,
    LocalDateTime dataInicio,
    LocalDateTime dataFim,
    String localEvento,
    Integer capacidade,
    String organizador,
    @Enumerated(EnumType.STRING) // para ajudar a lidar com enum no banco de dados
    TipoEvento tipoEvento
) {}
