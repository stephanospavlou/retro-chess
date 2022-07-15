package game;

import pieces.*;

public class Game {
    private Piece[][] board = new Piece[8][8];
    private Piece.Color curMove; 

    public Game() {
        curMove = Piece.Color.WHITE;

        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                this.board[i][j] = null;
            }
        }

        // initialize pieces
        for(int i = 0; i < 8; i++) {
            Position wPos = new Position(0, i);
            Pawn wPawn = new Pawn(Piece.Color.BLACK, wPos);
            this.board[0][i] = wPawn;

            Position bPos = new Position(7, i);
            Pawn bPawn = new Pawn(Piece.Color.BLACK, bPos);
            this.board[7][i] = bPawn;
        }
    }

    private void printBoard() {
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                if(this.board[i][j] == null) {
                    System.out.printf("_ ");
                } else {
                    if(this.board[i][j] instanceof Pawn) {
                        System.out.printf("P ");    
                    }
                }
            }
            System.out.printf("\n");
        }
        System.out.printf("\n\n");
    }

    private void handleMove() {
        if(curMove == Piece.Color.WHITE) {
            curMove = Piece.Color.BLACK;
        } else {
            curMove = Piece.Color.WHITE;
        }
    }

    private void gameLoop() {
        while(true) {
            this.printBoard();
            this.handleMove();
        }
    }

    public void start() {
        this.gameLoop();
    }
}