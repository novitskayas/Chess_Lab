package com.chessfab.entities;

import com.chessfab.exceptions.ColorMismatchException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class chessPiecesSetTest {

    @Test
    void addWhiteFigureToWhiteSet() {
        final chessPiece testedChessPiece = new chessPiece(chessPiece.pieceTypeEnum.king, materialisable.materialTypeEnum.titan, "white");
        chessPiecesSet chessPiecesSetForTest = new chessPiecesSet("white");

        chessPiecesSetForTest.addFigure(testedChessPiece);

        assertNotNull(chessPiecesSetForTest.getChessPieceByIndex(0));
    }

    @Test
    void addWhiteFigureToBlackSet() {
        final chessPiece testedChessPiece = new chessPiece(chessPiece.pieceTypeEnum.king, materialisable.materialTypeEnum.titan, "white");
        chessPiecesSet chessPiecesSetForTest = new chessPiecesSet("black");

        assertThrows(ColorMismatchException.class, () -> chessPiecesSetForTest.addFigure(testedChessPiece));
    }
}


