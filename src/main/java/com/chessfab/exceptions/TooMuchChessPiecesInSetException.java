package com.chessfab.exceptions;

public class TooMuchChessPiecesInSetException extends StackOverflowError {
    public TooMuchChessPiecesInSetException() {
        super("Too much chess pieces in set. Maximum pieces: 16");
    }
}
