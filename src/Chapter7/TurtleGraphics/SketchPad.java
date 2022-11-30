package Chapter7.TurtleGraphics;

public class SketchPad {

    private int [][] sketchPad;
    private String[][] graphicalSketchPad;

    public SketchPad(int row, int column){
        sketchPad = new int[row][column];
        graphicalSketchPad = new String[row][column];
    }

    public void addElements(int row, int column, int input){
        sketchPad[row][column] = input;
    }

    public String[][] arrayGraphicalInterpretation(){
        for (int rowIndex = 0; rowIndex != sketchPad.length; rowIndex++) {
            for (int colIndex = 0; colIndex != sketchPad[rowIndex].length; colIndex++) {
                if (sketchPad[rowIndex][colIndex] == 0){
                    graphicalSketchPad[rowIndex][colIndex] = " ";
                } else if (sketchPad[rowIndex][colIndex] == 1) {
                    graphicalSketchPad[rowIndex][colIndex] = "*";
                }
            }
        }return graphicalSketchPad;
    }

    public int[][] getSketchPad() {
        return sketchPad;
    }
}
