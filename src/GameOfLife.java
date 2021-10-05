public class GameOfLife {


    private Population population = new Population();

    public void setSeed(boolean[][] cells) {
        population.populate(cells);
    }

    public boolean[][] getCurrentGeneration() {
        return population.getCells();
    }
}
