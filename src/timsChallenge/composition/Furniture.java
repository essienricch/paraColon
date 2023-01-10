package timsChallenge.composition;

import java.util.List;

public class Furniture {

    private List <String> typesOfFurniture;
    private int numberOfFurniture;

    public Furniture(List<String> typesOfFurniture) {
        this.typesOfFurniture = typesOfFurniture;
        this.numberOfFurniture = typesOfFurniture.size();
    }

    public List<String> getTypesOfFurniture() {
        return typesOfFurniture;
    }

    public int getNumberOfFurniture() {
        return numberOfFurniture;
    }
}
