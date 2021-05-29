package com.chessfab.entities;

import com.chessfab.exceptions.*;

import java.util.ArrayList;

public class chessPiecesSet {
    public String color;
    private ArrayList<chessPiece> pieces;

    public chessPiecesSet(String color) {
        if(!color.equals("black") && !color.equals("white")) throw new InvalidColorException(color);
        this.pieces = new ArrayList<>();
        this.color = color;
    }

    public void addFigure(chessPiece piece) {
        if(!piece.getColor().equals(this.color)) throw new ColorMismatchException();
        int piecesSuchTypeInSetCount = getPieceTypeCount(piece);
        if(piecesSuchTypeInSetCount >= piece.getMaxInSet()) throw new TooMuchChessPiecesSameTypeInSetException(piecesSuchTypeInSetCount, piece.getMaxInSet());
        if(this.pieces.size() >= 16) throw new TooMuchChessPiecesInSetException();
        this.pieces.add(piece);
    }

    private int getPieceTypeCount(chessPiece piece) {
        int i;
        int count = 0;
        for (i = 0; i < this.pieces.size(); i++) {
            if(this.pieces.get(i).getPieceType().equals(piece.getPieceType())) count++;
        }
        return count;
    }

    public chessPiece getChessPieceByIndex(int i) {
        return this.pieces.get(i);
    }

    public int getSetSize() {
        return this.pieces.size();
    }
}
