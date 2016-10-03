package com.chess;
import com.chess.engine.classic.board.Board;
import com.chess.engine.classic.board.BoardUtils;
import com.chess.gui.Table;

public class Jchess {
    public static void main(String[] args){
        Board board = Board.createStandardBoard();

        System.out.println(board);

        Table.get().show();

    }
}
