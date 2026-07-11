package com.dev.java.EventClean.infra.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EventReporsitory extends JpaRepository<EventEntity, Long> {}
