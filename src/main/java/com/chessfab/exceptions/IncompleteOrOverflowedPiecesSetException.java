package com.chessfab.exceptions;

public class IncompleteOrOverflowedPiecesSetException extends IllegalArgumentException {
    public IncompleteOrOverflowedPiecesSetException() {
        super("Got incomplete or overflowed chess pieces set!");
    }
}
