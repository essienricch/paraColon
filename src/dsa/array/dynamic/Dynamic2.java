package dsa.array.dynamic;

import java.util.Arrays;

public class Dynamic2 {

    private int [] myArray;
    private int count;
    private int size;

    public Dynamic2(int size) {
        this.myArray = new int[size];
        this.size = size;
    }

    public void insert(int number) {
        myArray[count++] = number;
        if (count == myArray.length)
            updatePhase();
    }

    private void updatePhase() {
        int [] newSizedArray = new int[count + myArray.length];
        System.arraycopy(myArray,
                0,newSizedArray,0,myArray.length);
        myArray = newSizedArray;
    }

    public void delete(int number){
        int i;
        for (i = 0; i < count; i++) {
            if (myArray[i] == number){
                break;
            }
        } for (int j = i; j < count; j++) {
            myArray[i] = myArray[i + 1];
            count--;
        }
    }

    public int indexOf(int number){
        for (int i = 0; i < count; i++) {
            if (myArray[i] == number)
                return i;
        }
        return -1;
    }

    public int getMyArray() {
        return this.myArray[count--];
    }

    public void print(){
        for (int i = 0; i < count; i++) {
            System.out.println(myArray[i]);
        }
    }
}
