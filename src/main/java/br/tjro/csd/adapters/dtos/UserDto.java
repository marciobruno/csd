package br.tjro.csd.adapters.dtos;

import java.io.Serializable;

public record UserDto(Long id, String nome, String email) implements Serializable{}