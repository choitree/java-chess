package net.tree.chess;

<<<<<<< HEAD
import net.utils.StringUtils;
import org.junit.jupiter.api.BeforeEach;
=======
import net.tree.pieces.Pawn;
<<<<<<< HEAD
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
>>>>>>> 3c74074... feat : Do Mission2
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

<<<<<<< HEAD
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.assertj.core.api.Assertions.*;
=======
import static org.junit.jupiter.api.Assertions.*;
=======
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
>>>>>>> feat : Do Mission2
>>>>>>> 3c74074... feat : Do Mission2

class BoardTest {

    private Board board;

<<<<<<< HEAD
    @BeforeEach
    void setup() {
        board = new Board();
=======
<<<<<<< HEAD
    @DisplayName("하얀색, 검정색 pawn 만들기")
    @Test
    public void create() {
=======
    @Test
    public void create() throws Exception {
>>>>>>> feat : Do Mission2
        Board board = new Board();

        Pawn white = new Pawn(Pawn.WHITE_COLOR);
        board.add(white);
<<<<<<< HEAD
        Assertions.assertAll(
            () -> assertEquals(1, board.checkPawnSize()),
            () -> assertEquals(white, board.findPawn(0))
        );

        Pawn black = new Pawn(Pawn.BLACK_COLOR);
        board.add(black);
        Assertions.assertAll(
                () -> assertEquals(2, board.checkPawnSize()),
                () -> assertEquals(black, board.findPawn(1))
        );
>>>>>>> 3c74074... feat : Do Mission2
    }

    @DisplayName("보드 생성하기(모든 피스 포함)")
    @Test
<<<<<<< HEAD
    void createBoard() {
        board.initialize();
        assertEquals(32, board.pieceCount());
        String blankRank = appendNewLine("........");
        assertThat(board.showBoard())
                .isEqualTo(
                        appendNewLine("RNBQKBNR") +
                        appendNewLine("PPPPPPPP") +
                        blankRank + blankRank + blankRank + blankRank +
                        appendNewLine("pppppppp") +
                        appendNewLine("rnbqkbnr"));

        System.out.println(board.showBoard());
=======
    public void checkPawnList() {
        Board board = new Board();
=======
        assertEquals(1, board.size());
        assertEquals(white, board.findPawn(0));


        Pawn black = new Pawn(Pawn.BLACK_COLOR);
        board.add(black);
        assertEquals(2, board.size());
        assertEquals(black, board.findPawn(1));

    }

    @DisplayName("컴파일 에러 발생시키기")
    @Test
    public void checkPawnList() throws Exception {
        Board board = new Board();
        assertTrue(board.pawnList.add("7"));
>>>>>>> feat : Do Mission2
        assertTrue(board.pawnList.add(new Pawn()));
>>>>>>> 3c74074... feat : Do Mission2
    }

    //개행 추가시키는 메소드
    private String appendNewLine(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append(StringUtils.NEWLINE);
        return sb.toString();
    }


}
