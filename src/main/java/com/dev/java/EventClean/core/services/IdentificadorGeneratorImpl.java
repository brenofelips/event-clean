package com.dev.java.EventClean.core.services;

import java.security.SecureRandom;

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
