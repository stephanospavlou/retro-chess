package pieces;

public class Pawn extends Piece {
    public Pawn(Color color, Position pos) {
        super(color, pos);
    }

    public boolean isValidMove(Position pos) {
        if(this.color == Color.WHITE) {
            if(this.pos.x == 0) {
                if(pos.x == this.pos.x + 1 || pos.x == this.pos.x + 2) {
                    return true;
                } else {
                    return false;
                }
            } else {
                if(pos.x == this.pos.x + 1) {
                    return true;
                } else {
                    return false;
                }
            }
        } else {
            if(this.pos.x == 0) {
                if(pos.x == this.pos.x - 1 || pos.x == this.pos.x - 2) {
                    return true;
                } else {
                    return false;
                }
            } else {
                if(pos.x == this.pos.x - 1) {
                    return true;
                } else {
                    return false;
                }
            }
        }
    }
}