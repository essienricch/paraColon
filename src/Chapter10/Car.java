package Chapter10;

import Chapter10.Animal.Movable;

public class Car implements Movable {

    @Override
    public void move() {
        System.out.println("Zoom Zoom Zoom");
    }

    @Override
    public void moveSlowly() {

    }
}
