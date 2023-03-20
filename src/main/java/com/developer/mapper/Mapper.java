package com.developer.mapper;

public interface Mapper<SOURCE, TARGET> {

  TARGET map(SOURCE source);
}
