package Chapter7;

public class SchoolAdmin {

    private int [][] nativeScores = new int[2][5];
    private double [] averageScores = new double[2];

    public SchoolAdmin(){};
    public SchoolAdmin(int[][] scores){
        nativeScores = scores;
    }

    public void setNativeScores(int[][] nativeScores) {
        this.nativeScores = nativeScores;
    }

    public double[] getAverageScores() {
        return averageScores;
    }

    public void setAverageScores(double[] averageScores) {
        this.averageScores = averageScores;
    }

    public int[][] getNativeScores() {
        return nativeScores;
    }

    public double [] calculateAverageScore() {
        int totalScore = 0;
        for (int row = 0; row < nativeScores.length; row++) {
            for (int column = 0; column < nativeScores[row].length; column++) {
                totalScore += nativeScores[row][column];
            }averageScores[row] = (double) totalScore/ nativeScores.length;
        }return averageScores;

    }
}
