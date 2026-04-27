package bordgame;

public class Piece {
    protected Position posicion;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        posicion = null;
    }

    protected Board getBoard() {
        return board;
    }
}
