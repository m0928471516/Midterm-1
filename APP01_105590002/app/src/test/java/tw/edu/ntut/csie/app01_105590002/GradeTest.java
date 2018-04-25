package tw.edu.ntut.csie.app01_105590002;

import static org.junit.Assert.assertEquals;

/**
 * Created by NTUTCSIE on 2018/4/25.
 */

public class GradeTest {
    Grade grade = new Grade();


    public void getGrade() {
        String s = grade.letterGrade(101);
        assertEquals(s, "X");
        s = grade.letterGrade(100);
        assertEquals(s, "A");
        s = grade.letterGrade(89);
        assertEquals(s, "B");
        s = grade.letterGrade(79);
        assertEquals(s, "C");
        s = grade.letterGrade(69);
        assertEquals(s, "D");
        s = grade.letterGrade(59);
        assertEquals(s, "F");
    }
}

