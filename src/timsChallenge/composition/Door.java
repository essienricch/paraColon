package timsChallenge.composition;

public class Door {

    private String color;
    private boolean keys;

    private boolean isLock;

    public Door(String color, boolean keys) {
        this.color = color;
        this.keys = keys;
    }

    private boolean isKeys(){
        return keys;
    }

    private boolean rotateRight(){
        return isKeys();
    }

    private boolean rotateLeft(){
        return isKeys();
    }

    public String setLock(){
        if (rotateLeft()){
            isLock = true;
            return "Door is Open";
        }else if (rotateRight()){
            isLock = false;
            return "Door is Locked";
        }return null;
    }


}
