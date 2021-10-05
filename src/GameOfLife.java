import java.util.Arrays;
import java.util.stream.Stream;

public class GameOfLife {

    private Population population = new Population();

    public void setSeed(int[][] cells) {
        population.populate(cells);
    }

    public int[][] getCurrentGeneration() {
        return population.getCells();
    }

    public void tick() {
       population.calculateNextGeneration();
    }
}
