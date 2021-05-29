package com.chessfab.exceptions;

public class InvalidColorException extends IllegalArgumentException {
    public InvalidColorException(String s) {
        super("Expected black or white color, but got: " + s);
    }
}
