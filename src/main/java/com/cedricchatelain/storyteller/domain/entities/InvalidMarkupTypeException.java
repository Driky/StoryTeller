package com.cedricchatelain.storyteller.domain.entities;

public class InvalidMarkupTypeException extends RuntimeException {
    public InvalidMarkupTypeException(String message) {
        super(message);
    }
}
