package com.chessfab.entities;

import com.chessfab.exceptions.ColorMismatchException;
import com.chessfab.exceptions.IncompleteOrOverflowedPiecesSetException;

public class gameSet {
    public chessPiecesSet whitePieces, blackPieces;
    public chessBoard board;
    private boolean withInstruction;

    public gameSet(chessBoard board, chessPiecesSet whitePieces, chessPiecesSet blackPieces) {
        if(whitePieces.getSetSize() != 16 || blackPieces.getSetSize() != 16) throw new IncompleteOrOverflowedPiecesSetException();
        if(!whitePieces.color.equals("white") || !blackPieces.color.equals("black")) throw new ColorMismatchException();
        this.withInstruction = false;
        this.board = board;
        this.blackPieces = blackPieces;
        this.whitePieces = whitePieces;
    }

    public void setWithInstruction(boolean withInstruction) {
        this.withInstruction = withInstruction;
    }

    public boolean isWithInstruction() {
        return this.withInstruction;
    }

    @Override
    public String toString() {
        return "Chess game set with " + this.board.materialType() + " " + this.board.getSize() + " board and " + (isWithInstruction()?"with":"without") + " instruction.";
    }
}
