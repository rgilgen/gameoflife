public class GameOfLife {

    private boolean[][] cells;

    public void setSeed(boolean[][] cells) {
        this.cells = cells;
    }

    public boolean[][] getCurrentGeneration() {
        return cells;
    }
}
