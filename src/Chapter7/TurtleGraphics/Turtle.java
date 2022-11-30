package Chapter7.TurtleGraphics;

public class Turtle {

    private Pen pen;
    private Position position;
    private Direction direction;
    private SketchPad sketchPad;

    public Turtle(){
        pen = new Pen();
        pen.penUp();
        direction = Direction.EAST;
        position = new Position(0,0);
        sketchPad =new SketchPad(20,20);
    }

    public void penUp() {
        pen.penUp();
    }

    public void penDown(){
        pen.penDown();
    }

    public void turnRight(){
        switch (direction){
            case EAST -> face(Direction.SOUTH);
            case SOUTH -> face(Direction.WEST);
            case WEST ->  face(Direction.NORTH);
            case NORTH -> face(Direction.EAST);
        }
    }

    public void turnLeft(){
        switch (direction){
            case EAST -> face(Direction.NORTH);
            case SOUTH -> face(Direction.EAST);
            case WEST -> face(Direction.SOUTH);
            case NORTH -> face(Direction.WEST);
        }
    }

    private void face (Direction direction){
        this.direction = direction;
    }

    public void move(int numberOfSteps){
        if (numberOfSteps + getPosition().getColumn() < getSketchPad().length ||
                numberOfSteps + getPosition().getRow() < getSketchPad().length ){
            switch (direction){
                case EAST -> position.setColumn(position.getColumn() + numberOfSteps);
                case SOUTH -> position.setRow(position.getRow() + numberOfSteps);
                case WEST -> position.setColumn(position.getColumn() - numberOfSteps);
                case NORTH -> position.setRow(position.getRow() - numberOfSteps);
            }
        }
        write();
    }

    private void write(){
        if (!pen.isPenUp()){
            for (int rowIndex = 0; rowIndex <= position.getRow(); rowIndex++) {
                for (int colIndex = 0; colIndex <= position.getColumn() ; colIndex++) {
                    sketchPad.addElements(rowIndex,colIndex,1);
                }
            }
        }
    }
    public void createSketchPad(SketchPad sketchPad){
        this.sketchPad = sketchPad;
    }

    public boolean isPenUp(){
        return pen.isPenUp();
    }


    public Position getPosition() {
        return position;
    }

    public Direction getDirection() {
        return direction;
    }

    public String[][] getSketchPad() {
        return sketchPad.arrayGraphicalInterpretation();
    }
}
