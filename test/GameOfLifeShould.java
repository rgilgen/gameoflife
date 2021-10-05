
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
/*
The universe of the Game of Life is an infinite, two-dimensional orthogonal grid of square cells,
each of which is in one of two possible states, live or dead, (or populated and unpopulated, respectively).
Every cell interacts with its eight neighbours, which are the cells that are horizontally, vertically,
or diagonally adjacent. At each step in time, the following transitions occur:
1) Any live cell with two or three live neighbours survives.
2) Any dead cell with three live neighbours becomes a live cell.
3) All other live cells die in the next generation. Similarly, all other dead cells stay dead.

X X X
X X X
X X X


 */
class GameOfLifeShould {

    @Test
    void returnDeadGenerationWithDeadSeedAndNoTick(){
        GameOfLife gameOfLife = new GameOfLife();
        boolean[][] cells = {{false, false, false},{false, false, false},{false, false, false}};
        gameOfLife.setSeed(cells);

        boolean[][] actual = gameOfLife.getCurrentGeneration();

        assertEquals(cells[0][0], actual[0][0]);
        assertEquals(cells[0][1], actual[0][1]);
        assertEquals(cells[0][2], actual[0][2]);
        assertEquals(cells[1][0], actual[1][0]);
        assertEquals(cells[1][1], actual[1][1]);
        assertEquals(cells[1][2], actual[1][2]);
        assertEquals(cells[2][0], actual[2][0]);
        assertEquals(cells[2][1], actual[2][1]);
        assertEquals(cells[2][2], actual[2][2]);
    }

    @Test
    void returnDeadGenerationWithOneLivingCellInSeedAndNoTick(){
        GameOfLife gameOfLife = new GameOfLife();
        boolean[][] cells = {{false, false, false},{false, true, false},{false, false, false}};
        gameOfLife.setSeed(cells);

        boolean[][] actual = gameOfLife.getCurrentGeneration();

        assertEquals(cells[0][0], actual[0][0]);
        assertEquals(cells[0][1], actual[0][1]);
        assertEquals(cells[0][2], actual[0][2]);
        assertEquals(cells[1][0], actual[1][0]);
        assertEquals(cells[1][1], actual[1][1]);
        assertEquals(cells[1][2], actual[1][2]);
        assertEquals(cells[2][0], actual[2][0]);
        assertEquals(cells[2][1], actual[2][1]);
        assertEquals(cells[2][2], actual[2][2]);
    }


}