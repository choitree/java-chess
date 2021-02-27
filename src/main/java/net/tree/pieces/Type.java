package net.tree.pieces;

public enum Type {
    PAWN('p'),
    ROOK('r'),
    KNIGHT('n'),
    BISHOP('b'),
    QUEEN('q'),
    KING('k'),
    NO_PIECE('_');

    private char representation;

    Type(char representation) {
        this.representation = representation;
    }

    public char getNoColorRepresentation() {
        return this.representation;
    }

    public char getWhiteRepresentation() {
        return Character.toLowerCase(this.representation);
    }

    public char getBlackRepresentation() {
        return Character.toUpperCase(this.representation);
    }
}
