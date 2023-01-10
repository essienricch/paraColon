package Chapter4.rightAngleTriangle;

public class Right_Angled_Triangle {

    private int baseLength;

    public Right_Angled_Triangle(int baseLength) {
        this.baseLength = baseLength;
    }

    public void drawRightAngleWithAsterisks(int length) {
        if (length >= 1 && length <= 10) {
            for (int i = 1; i < length; i++) {
                for (int j = 1; j < i; j++) {
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }
    }

    public void drawRightAngleWithAsterisks() {
        if (baseLength >= 1 && baseLength <= 10) {
            for (int i = 1; i < baseLength; i++) {
                for (int j = 1; j < i; j++) {
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }
    }

}

