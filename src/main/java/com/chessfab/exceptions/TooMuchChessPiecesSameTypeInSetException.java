package com.chessfab.exceptions;

public class TooMuchChessPiecesSameTypeInSetException extends StackOverflowError {
    public TooMuchChessPiecesSameTypeInSetException(int piecesSuchTypeInSetCount, int maxInSet) {
        super("Too many same type figures in set. Maximum allowed figures: " + maxInSet + ", but tried to add " + piecesSuchTypeInSetCount+1);
    }
}
