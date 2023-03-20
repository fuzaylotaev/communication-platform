package com.developer.converter;

public interface Converter<SOURCE, TARGET> {

  TARGET convert(SOURCE source);
}
