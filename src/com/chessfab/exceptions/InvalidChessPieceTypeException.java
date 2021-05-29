package com.chessfab.exceptions;

public class InvalidChessPieceTypeException extends IllegalArgumentException {
    public InvalidChessPieceTypeException() {
        super("Got invalid chess piece type during execution.");
    }
}
