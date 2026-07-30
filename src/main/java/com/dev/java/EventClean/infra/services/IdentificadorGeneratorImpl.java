package com.dev.java.EventClean.infra.services;

import com.dev.java.EventClean.core.services.IdentificadorGenerator;
import java.security.SecureRandom;
import org.springframework.stereotype.Component;

@Component
public class IdentificadorGeneratorImpl implements IdentificadorGenerator {
  private static final String CARACTERES = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
  private static final int TAMANHO = 6;

  private final SecureRandom random = new SecureRandom();

  @Override
  public String generate() {
    StringBuilder sb = new StringBuilder(TAMANHO);
    for (int i = 0; i < TAMANHO; i++) {
      sb.append(CARACTERES.charAt(random.nextInt(CARACTERES.length())));
    }
    return sb.toString();
  }
}
