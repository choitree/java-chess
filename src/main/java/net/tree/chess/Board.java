package net.tree.chess;

import net.tree.pieces.Piece;

import java.util.ArrayList;
import java.util.List;

import static net.utils.StringUtils.appendNewLine;

public class Board {

<<<<<<< HEAD
    private List<Piece> whitePieceList = new ArrayList<>();
    private List<Piece> blackPieceList = new ArrayList<>();
    private final int BOARD_SIZE = 8;
    private String blankDot = "........";

    public void initialize() {
        initializeWhitePieces();
        initializeBlackPieces();
    }
=======
    List<Pawn> pawnList = new ArrayList<>();
<<<<<<< HEAD
    final int BOARD_SIZE = 8;
<<<<<<< HEAD
    String blankDot = "........\n";
<<<<<<< HEAD
>>>>>>> a101753... feat : Do Mission3

    public void initializeWhitePieces() {
        whitePieceList.add(Piece.createWhiteRook());
        whitePieceList.add(Piece.createWhiteKnight());
        whitePieceList.add(Piece.createWhiteBishop());
        whitePieceList.add(Piece.createWhiteQueen());
        whitePieceList.add(Piece.createWhiteKing());
        whitePieceList.add(Piece.createWhiteBishop());
        whitePieceList.add(Piece.createWhiteKnight());
        whitePieceList.add(Piece.createWhiteRook());

        for(int i = 0 ; i < BOARD_SIZE ; i++) {
            whitePieceList.add(Piece.createWhitePawn());
        }
    }
=======
<<<<<<< HEAD
>>>>>>> e071e51... feat : Do Mission3

    public void initializeBlackPieces() {
        blackPieceList.add(Piece.createBlackRook());
        blackPieceList.add(Piece.createBlackKnight());
        blackPieceList.add(Piece.createBlackBishop());
        blackPieceList.add(Piece.createBlackQueen());
        blackPieceList.add(Piece.createBlackKing());
        blackPieceList.add(Piece.createBlackBishop());
        blackPieceList.add(Piece.createBlackKnight());
        blackPieceList.add(Piece.createBlackRook());

<<<<<<< HEAD
        for(int i = 0 ; i < BOARD_SIZE ; i++) {
            blackPieceList.add(Piece.createBlackPawn());
        }
=======
<<<<<<< HEAD
<<<<<<< HEAD
    public void add(Pawn pawn) {
        pawnList.add(pawn);
>>>>>>> 3c74074... feat : Do Mission2
    }

    //전체 피스 개수 세어주는 메소드
    public int pieceCount() {
        return whitePieceList.size() + blackPieceList.size();
    }

    //보드 프린트하는 메소드
    public String showBoard() {
        StringBuilder sb = new StringBuilder();
        sb.append(appendNewLine(getExceptPawnPieces(blackPieceList)));
        sb.append(appendNewLine(getPawnPieces(blackPieceList)));
        sb.append(appendNewLine(blankDot));
        sb.append(appendNewLine(blankDot));
        sb.append(appendNewLine(blankDot));
        sb.append(appendNewLine(blankDot));
        sb.append(appendNewLine(getPawnPieces(whitePieceList)));
        sb.append(appendNewLine(getExceptPawnPieces(whitePieceList)));

        return sb.toString();
    }

<<<<<<< HEAD
    public String getExceptPawnPieces(List<Piece> list) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < list.size() ; i++) {
            String tempRepresentation = Character.toString(list.get(i).getRepresentation());
            if(! tempRepresentation.toLowerCase().equals("p")) {
                sb.append(list.get(i).getRepresentation());
            }
        }
        return sb.toString();
    }
=======
        Pawn pawn = pawnList.get(listIndex);
=======
=======

<<<<<<< HEAD
>>>>>>> feat : Do Mission2
    public void add(Pawn pawnColor) {
        pawnList.add(pawnColor);
=======
=======
>>>>>>> feat : Do Mission3
=======
    private String blankDot = "........\n";
>>>>>>> kyu가 리뷰해준 내용 반영하였습니다.
    public void add(Pawn pawn) {
=======
    private final int BOARD_SIZE = 8;
    private String line = "........\n";

<<<<<<< HEAD
    public void addPawntopawnList(Pawn pawn) {
>>>>>>> Dion이 리뷰해주신 내용 반영하다.
=======
    public void addPawnToPawnList(Pawn pawn) {
>>>>>>> Dion의 두번째 리뷰 내용 반영
        pawnList.add(pawn);
>>>>>>> rebase mission3
    }

    public int checkPawnSize() {
        return pawnList.size();
    }

    public Pawn findPawn(int listIndex) {

<<<<<<< HEAD
        Pawn pawn = pawnList.get(i);
>>>>>>> feat : Do Mission2
<<<<<<< HEAD
>>>>>>> 3c74074... feat : Do Mission2
=======
=======
        Pawn pawn = pawnList.get(listIndex);
<<<<<<< HEAD
>>>>>>> fix : Fix mission1
>>>>>>> 124d6ee... fix : Fix mission1

<<<<<<< HEAD
    public String getPawnPieces(List<Piece> list) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < list.size() ; i++) {
            String tempRepresentation = Character.toString(list.get(i).getRepresentation());
            if(tempRepresentation.toLowerCase().equals("p")) {
                sb.append(list.get(i).getRepresentation());
            }
        }
        return sb.toString();
=======
=======
>>>>>>> feat : Do Mission2
        return pawn;
>>>>>>> 8a78563... feat : Do Mission2
    }

<<<<<<< HEAD
<<<<<<< HEAD

=======
    public List<Pawn> initialize() {
=======
    public void initialize() {
>>>>>>> 4e4c335... Dion이 리뷰해주신 내용 반영하다.
        for(int i = 0 ; i < BOARD_SIZE ; i++) {
            addPawnToPawnList(new Pawn(Pawn.WHITE_COLOR, Pawn.WHITE_REPRESENTATION));
            addPawnToPawnList(new Pawn(Pawn.BLACK_COLOR, Pawn.BLACK_REPRESENTATION));
        }
    }

    public String getPawnsResult(char representation) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < pawnList.size() ; i++) {
            if(pawnList.get(i).getRepresentation() == representation) {
                sb.append(representation);
            }
        }
        return sb.toString();
    }

    public String getPawnsRepresentation() {
        StringBuilder pawnsRepresentation = new StringBuilder();
        pawnsRepresentation.append(line);
        pawnsRepresentation.append(getPawnsResult(Pawn.BLACK_REPRESENTATION) + "\n");
        pawnsRepresentation.append(line);
        pawnsRepresentation.append(line);
        pawnsRepresentation.append(line);
        pawnsRepresentation.append(line);
        pawnsRepresentation.append(getPawnsResult(Pawn.WHITE_REPRESENTATION) + "\n");
        pawnsRepresentation.append(line);

        return pawnsRepresentation.toString();
    }

<<<<<<< HEAD
    public void print() {
        System.out.println(saveStringBuilder());
    }
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> a101753... feat : Do Mission3
=======

>>>>>>> 1f82d36... feat : Do Mission2
=======
>>>>>>> e071e51... feat : Do Mission3
=======
=======
>>>>>>> 4e4c335... Dion이 리뷰해주신 내용 반영하다.

>>>>>>> a20eb16... kyu가 리뷰해준 내용 반영하였습니다.
}
