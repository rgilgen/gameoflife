class Population {

    private int[][] cells;

    public void populate(int[][] cells) {
        this.cells = cells;
    }

    public int[][] getCells() {
        return cells;
    }

    public void calculateNextGeneration() {
        for(int i=0; i < cells.length; i++){
            for(int j=0;j<cells[i].length;j++){
                cells[i][j] = 0;
            }
        }
    }
}
