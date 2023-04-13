package ru.job4j.chess.firuges.black;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

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

    @Test
    void isDiagonal() {
        Cell respawn = Cell.C1;
        Cell destination = Cell.G5;
        BishopBlack bishopBlack = new BishopBlack(respawn);
        boolean result = bishopBlack.isDiagonal(respawn, destination);
        assertThat(result).isTrue();
    }

    @Test
    void wayC1toG5() {
        Cell respawn = Cell.C1;
        Cell destination = Cell.G5;
        Cell[] expected = new Cell[] {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        Figure bishopBlack = new BishopBlack(respawn);
        Cell[] result = bishopBlack.way(destination);
        assertThat(result).containsExactly(expected);
    }

    @Test
    void wayG5toC1() {
        Cell respawn = Cell.G5;
        Cell destination = Cell.C1;
        Cell[] expected = new Cell[] {Cell.F4, Cell.E3, Cell.D2, Cell.C1};
        Figure bishopBlack = new BishopBlack(respawn);
        Cell[] result = bishopBlack.way(destination);
        assertThat(result).containsExactly(expected);
    }

    @Test
    void wayH8toA1() {
        Cell respawn = Cell.H8;
        Cell destination = Cell.A1;
        Cell[] expected = new Cell[] {Cell.G7, Cell.F6, Cell.E5, Cell.D4, Cell.C3, Cell.B2, Cell.A1};
        Figure bishopBlack = new BishopBlack(respawn);
        Cell[] result = bishopBlack.way(destination);
        assertThat(result).containsExactly(expected);
    }

    @Test
    void wayG1toA7() {
        Cell respawn = Cell.G1;
        Cell destination = Cell.A7;
        Cell[] expected = new Cell[] {Cell.F2, Cell.E3, Cell.D4, Cell.C5, Cell.B6, Cell.A7};
        Figure bishopBlack = new BishopBlack(respawn);
        Cell[] result = bishopBlack.way(destination);
        assertThat(result).containsExactly(expected);
    }
}
