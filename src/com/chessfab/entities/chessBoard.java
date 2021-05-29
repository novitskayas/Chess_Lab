package com.chessfab.entities;

import java.util.ArrayList;

public class chessBoard extends materialisable {
    private boardSize size;

    public enum boardSize {
        small,
        medium,
        big
    }

    public chessBoard(boardSize size, materialTypeEnum material) {
        setMaterialType(material);
        this.size = size;
    }

    public String getSize() {
        return this.size.toString();
    }
}
