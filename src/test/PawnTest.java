import net.tree.chess.Pawn;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PawnTest {

    @Test
    @DisplayName("흰색 폰이 생성되어야 한다")
    public void create() {
        verifyPawn("white");
        verifyPawn("black");
//        Pawn pawn = new Pawn("white");
//        assertThat(pawn.getColor()).isEqualTo("white");
    }

    void verifyPawn(final String color) {
        Pawn pawn = new Pawn(color);
        assertEquals(color, pawn.getColor());
    }
}