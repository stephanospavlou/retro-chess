package pieces;

public abstract class Piece {
    public enum Color {WHITE, BLACK}
    protected Color color;
    protected Position pos;

    public Piece(Color color, Position pos) {
        this.color = color;
        this.pos = pos;
    }

    public abstract boolean isValidMove(Position pos);
}