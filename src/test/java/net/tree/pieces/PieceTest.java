package net.tree.pieces;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class PieceTest {


    @DisplayName("피스가 색상에 맞게 생성되는지 검증")
    @Test
    void getRepresentationByPiece() {
        assertAll(
                () -> assertThat(Type.PAWN.getWhiteRepresentation()).isEqualTo('p'),
                () -> assertThat(Type.PAWN.getBlackRepresentation()).isEqualTo('P')
        );
    }

    @DisplayName("Type으로 생성한 피스의 속성이 맞는지 검증")
    @Test
    void createAllPiecesWithType() {
        verifyPieceByType(Piece.createWhitePawn(), Piece.createBlackPawn(), Type.PAWN);
        verifyPieceByType(Piece.createWhiteKnight(), Piece.createBlackKnight(), Type.KNIGHT);
        verifyPieceByType(Piece.createWhiteRook(), Piece.createBlackRook(), Type.ROOK);
        verifyPieceByType(Piece.createWhiteBishop(), Piece.createBlackBishop(), Type.BISHOP);
        verifyPieceByType(Piece.createWhiteQueen(), Piece.createBlackQueen(), Type.QUEEN);
        verifyPieceByType(Piece.createWhiteKing(), Piece.createBlackKing(), Type.KING);
    }

    private void verifyPieceByType(final Piece whitePiece, final Piece blackPiece, final Type type) {
        assertAll(
                () -> assertThat(whitePiece.isWhite()).isTrue(),
                () -> assertThat(whitePiece.getType()).isEqualTo(type),

                () -> assertThat(blackPiece.isBlack()).isTrue(),
                () -> assertThat(blackPiece.getType()).isEqualTo(type)
        );
    }

    @DisplayName("비어있는 Piece 생성되는지 검증")
    @Test
    void checkBlankNoColorPiece() {
        Piece blank = Piece.createBlank();

        assertAll(
                () -> assertThat(blank.isWhite()).isFalse(),
                () -> assertThat(blank.isBlack()).isFalse(),
                () -> assertThat(blank.getType()).isEqualTo(Type.NO_PIECE)
        );
    }



}
