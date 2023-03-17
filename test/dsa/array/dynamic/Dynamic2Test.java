package dsa.array.dynamic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Dynamic2Test {

    private Dynamic2 dynamic2;

    @BeforeEach
    void setUp(){
        dynamic2 = new Dynamic2(3);
    }

    @Test
    void insertItemsIntoDynamicArray_checkForIndexOfDigitInsertedTest(){
       dynamic2.insert(2);
        dynamic2.insert(3);
        dynamic2.insert(4);
        dynamic2.insert(5);
        dynamic2.insert(6);
        dynamic2.insert(7);
        dynamic2.insert(8);
        dynamic2.insert(77);
        int lastDigit = dynamic2.indexOf(77);
        dynamic2.print();
        assertEquals(7, lastDigit);

    }

    @Test
    void deleteItemInTheDynamicArrayTest(){
        dynamic2.insert(2);
        dynamic2.insert(3);
        dynamic2.insert(4);
        dynamic2.insert(5);
        dynamic2.delete(3);

        assertEquals(2,dynamic2.indexOf(5));
        dynamic2.print();

    }

}