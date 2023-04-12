package ru.job4j.chess.firuges.black;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.junit.jupiter.api.Assertions.*;

class BishopBlackTest {

    @Test
    void position() {
        Cell expected = Cell.F8;
        Figure bishopBlack = new BishopBlack(expected);
        Cell result = bishopBlack.position();
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void copy() {
        Cell respawn = Cell.F8;
        Cell destination = Cell.A3;
        Figure bishopBlackBeforeCopy = new BishopBlack(respawn);
        Figure bishopBlackAfterCopy = bishopBlackBeforeCopy.copy(destination);
        Cell result = bishopBlackAfterCopy.position();
        assertThat(destination).isEqualTo(result);
    }
}
