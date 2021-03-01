package net.tree.pieces;

public class Piece {

    private Color color;
    private char representation;
    private Type type;

    private static final String WHITE_COLOR = "WHITE";
    private static final String BLACK_COLOR = "BLACK";

    private Piece() {}

    private Piece(Type type) {
         this.type = type;
    }

    public static Piece createWhitePiece(Type type) {
         Piece piece = new Piece(type);
         piece.color = Color.WHITE;
         piece.representation = type.getWhiteRepresentation();
         return piece;
    }

    public static Piece createBlackPiece(Type type) {
         Piece piece = new Piece(type);
         piece.color = Color.BLACK;
         piece.representation = type.getBlackRepresentation();
         return piece;
    }

    public static Piece createBlank() {
        Piece piece = new Piece(Type.NO_PIECE);
        piece.color = Color.NOCOLOR;
        piece.representation = Type.NO_PIECE.getNoColorRepresentation();
        return piece;
    }



    public char getRepresentation() {
        return representation;
    }

    public Type getType() {
        return type;
    }

    public boolean isBlack() {
       return color == Color.BLACK;
    }

    public boolean isWhite() {
        return color == Color.WHITE;
    }
}
