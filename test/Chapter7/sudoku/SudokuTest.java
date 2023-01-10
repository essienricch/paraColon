package Chapter7.sudoku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SudokuTest {

    @Test
    void createSudokuOfDifferentSizeBoardTest(){
        Sudoku mySudok = new Sudoku();
        mySudok.checkersBoard(9);
    }

}