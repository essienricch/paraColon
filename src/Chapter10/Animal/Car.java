package Chapter10.Animal;

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
