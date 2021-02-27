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
        verifyPieceByType(Piece.createWhitePiece(Type.PAWN), Piece.createBlackPiece(Type.PAWN), Type.PAWN);
        verifyPieceByType(Piece.createWhitePiece(Type.KNIGHT), Piece.createWhitePiece(Type.KNIGHT), Type.KNIGHT);
        verifyPieceByType(Piece.createWhitePiece(Type.ROOK), Piece.createBlackPiece(Type.ROOK), Type.ROOK);
        verifyPieceByType(Piece.createWhitePiece(Type.BISHOP), Piece.createBlackPiece(Type.BISHOP), Type.BISHOP);
        verifyPieceByType(Piece.createWhitePiece(Type.QUEEN), Piece.createBlackPiece(Type.QUEEN), Type.QUEEN);
        verifyPieceByType(Piece.createWhitePiece(Type.KING), Piece.createBlackPiece(Type.KING), Type.KING);
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
        Piece blank = Piece.createBlank(Type.NO_PIECE);

        assertAll(
                () -> assertThat(blank.isWhite()).isFalse(),
                () -> assertThat(blank.isBlack()).isFalse(),
                () -> assertThat(blank.getType()).isEqualTo(Type.NO_PIECE),
                () -> assertThat(blank.getRepresentation()).isEqualTo(Type.NO_PIECE.getNoColorRepresentation())
        );
    }



}
