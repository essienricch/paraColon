package snacks.Diary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {


    private Diary richDiary;

    @BeforeEach
    void setUp(){
        richDiary = new Diary("mercy", "passcode");
    }

    @Test
    void diaryExistsTest(){
        assertNotNull(richDiary);
    }

    @Test
    void newDiaryIsLocked(){
        assertTrue(richDiary.isLocked());
    }

    @Test
    void newDiaryCanBeUnlockedTest(){
        assertTrue(richDiary.isLocked());
        richDiary.unLockWith("passcode");
        assertFalse(richDiary.isLocked());
    }

    @Test
    void wrongPasswordCannotUnlockDiaryTest(){
        assertTrue(richDiary.isLocked());
        richDiary.unLockWith("wrongPass");
        assertTrue(richDiary.isLocked());
    }

    @Test
    void diaryCanBeLockedTest(){
        richDiary.unLockWith("passcode");
        assertFalse(richDiary.isLocked());

        richDiary.lock();
        assertTrue(richDiary.isLocked());
    }

    @Test
    void entriesCanBeAddedToTheDiary(){
        richDiary.unLockWith("passcode");
        assertFalse(richDiary.isLocked());

        richDiary.write("Meditation","Pray for Grace and blessings");
        assertEquals(1,richDiary.numberOfEvents());
    }

    @Test
    void entriesCanNotBeAddedToTheDiaryWhenLockedTest(){
        assertTrue(richDiary.isLocked());

        richDiary.write("Break-FAST","prepare break-fast");
        assertEquals(0, richDiary.numberOfEvents());
    }

    @Test
    void entriesCanBeFoundByIdTest(){
        richDiary.unLockWith("passcode");
        assertFalse(richDiary.isLocked());

        richDiary.write("Meditation","Pray for Grace and blessings");
        assertEquals(1,richDiary.numberOfEvents());

        Entry foundEntry = richDiary.findEntryWithId(1);

        assertEquals(1,foundEntry.getId());
        assertEquals("Meditation", foundEntry.getTitle());
        assertEquals("Pray for Grace and blessings",foundEntry.getBody());
    }


}
