package com.dev.java.EventClean.infra.persistence;

import com.dev.java.EventClean.core.enums.TipoEvento;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "Eventos")
public class EventEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String descricao;
  private String identificador;
  private LocalDateTime inicio;
  private LocalDateTime fim;
  private String localEvento;
  private Integer capacidade;
  private String organizador;
  @Enumerated(EnumType.STRING) // para ajudar a lidar com enum no banco de dados
  private TipoEvento tipoEvento;
}
