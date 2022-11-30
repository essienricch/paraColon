package Chapter7.TurtleGraphics;

public class Position {

    private int column;
    private int row;

    public Position(int row, int column){
        this.column = column;
        this.row = row;
    }

    @Override
    public String toString(){
        return "Position {" +
                "column= " + column +
                ", row = " + row +
                '}';
    }

    @Override
    public boolean equals(Object position){
        Position compared = (Position) position;
        return compared.row == this.row && compared.column == this.column;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }
}
