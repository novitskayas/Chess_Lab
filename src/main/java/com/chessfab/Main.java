package com.chessfab;

import com.chessfab.entities.*;

public class Main {

    public static void main(String[] args) {
        chessPiecesSet blackChessPiecesSet = new chessPiecesSet("black");
        chessPiecesSet whiteChessPiecesSet = new chessPiecesSet("white");
        chessBoard board = new chessBoard(chessBoard.boardSize.medium, materialisable.materialTypeEnum.redWood);

        blackChessPiecesSet.addFigure(new chessPiece(chessPiece.pieceTypeEnum.rook,   materialisable.materialTypeEnum.carbon, "black"));
        blackChessPiecesSet.addFigure(new chessPiece(chessPiece.pieceTypeEnum.rook,   materialisable.materialTypeEnum.carbon, "black"));
        blackChessPiecesSet.addFigure(new chessPiece(chessPiece.pieceTypeEnum.knight, materialisable.materialTypeEnum.plastic, "black"));
        blackChessPiecesSet.addFigure(new chessPiece(chessPiece.pieceTypeEnum.knight, materialisable.materialTypeEnum.plastic, "black"));
        blackChessPiecesSet.addFigure(new chessPiece(chessPiece.pieceTypeEnum.bishop, materialisable.materialTypeEnum.plastic, "black"));
        blackChessPiecesSet.addFigure(new chessPiece(chessPiece.pieceTypeEnum.bishop, materialisable.materialTypeEnum.plastic,   "black"));
        blackChessPiecesSet.addFigure(new chessPiece(chessPiece.pieceTypeEnum.queen,  materialisable.materialTypeEnum.titan, "black"));
        blackChessPiecesSet.addFigure(new chessPiece(chessPiece.pieceTypeEnum.king,   materialisable.materialTypeEnum.titan, "black"));
        for (int i = 0; i < 8; i++) {
            blackChessPiecesSet.addFigure(new chessPiece(chessPiece.pieceTypeEnum.pawn,   materialisable.materialTypeEnum.redWood, "black"));
        }

        whiteChessPiecesSet.addFigure(new chessPiece(chessPiece.pieceTypeEnum.rook,   materialisable.materialTypeEnum.stone, "white"));
        whiteChessPiecesSet.addFigure(new chessPiece(chessPiece.pieceTypeEnum.rook,   materialisable.materialTypeEnum.stone, "white"));
        whiteChessPiecesSet.addFigure(new chessPiece(chessPiece.pieceTypeEnum.knight, materialisable.materialTypeEnum.iron, "white"));
        whiteChessPiecesSet.addFigure(new chessPiece(chessPiece.pieceTypeEnum.knight, materialisable.materialTypeEnum.iron, "white"));
        whiteChessPiecesSet.addFigure(new chessPiece(chessPiece.pieceTypeEnum.bishop, materialisable.materialTypeEnum.iron, "white"));
        whiteChessPiecesSet.addFigure(new chessPiece(chessPiece.pieceTypeEnum.bishop, materialisable.materialTypeEnum.iron,   "white"));
        whiteChessPiecesSet.addFigure(new chessPiece(chessPiece.pieceTypeEnum.queen,  materialisable.materialTypeEnum.titan, "white"));
        whiteChessPiecesSet.addFigure(new chessPiece(chessPiece.pieceTypeEnum.king,   materialisable.materialTypeEnum.titan, "white"));
        for (int i = 0; i < 8; i++) {
            whiteChessPiecesSet.addFigure(new chessPiece(chessPiece.pieceTypeEnum.pawn,   materialisable.materialTypeEnum.redWood, "white"));
        }

        gameSet someSet = new gameSet(board, whiteChessPiecesSet, blackChessPiecesSet);
        System.out.println(someSet.toString());
        someSet.setWithInstruction(true);
        System.out.println(someSet.toString());
        System.out.println(someSet.blackPieces.getChessPieceByIndex(11).toString());
    }
}
