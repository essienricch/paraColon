package dsa.array.dynamic;

import java.util.Arrays;

public class DynamicSize {

    private int count = 0;
    private int [] array;
    private int size = 1;

    public DynamicSize(){
        this.array = new int[size];
    }

    public void add(int number){
        array[count++] = number;
        updateSize();
    }

    private void updateSize(){
        int [] temp = new int[++size];
        System.arraycopy(array,0,temp,0,array.length);
        array = temp;
    }

    public void print(){
      Arrays.stream(array).forEach(System.out::println);
    }

    public int[] getArray() {
        return array;
    }
}
