package com.chessfab.entities;

import com.chessfab.exceptions.InvalidColorException;

public class chessPiece extends materialisable {
    private final pieceTypeEnum pieceType;
    private final String color;
    private int maxInSet;

    public enum pieceTypeEnum {
        king,
        queen,
        bishop,
        knight,
        rook,
        pawn
    }

    public chessPiece(pieceTypeEnum pieceType, materialTypeEnum materialType, String color) {
        if(!color.equals("black") && !color.equals("white")) throw new InvalidColorException(color);
        setMaterialType(materialType);
        this.pieceType = pieceType;
        this.color = color;
        switch (pieceType) {
            case king, queen: this.maxInSet = 1;
            case bishop, knight, rook: this.maxInSet = 2;
            case pawn: this.maxInSet = 8;
        }
    }

    public int getMaxInSet() {
        return this.maxInSet;
    }

    public pieceTypeEnum getPieceType() {
        return this.pieceType;
    }

    public String getColor() {
        return this.color;
    }

    @Override
    public String toString() {
        return this.color + " " + this.pieceType + " chess piece made of " + this.materialType();
    }
}
