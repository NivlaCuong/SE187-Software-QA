package DomainTesting;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class ScoreDeterminationTest {

    ScoreDetermination c;

    /**
     * This function will generate 50 random number from -3 to 103
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
        c = new ScoreDetermination();
        Random random = new Random();
        for(int i = 0; i <= 50; i++) {
          int ranNum = random.nextInt(103 + 3) - 3;
          c.addScore(ranNum);
        }
    }


    /**
     * A Function will test to see if each random number grade is corresponded to the right letter Grade
     */
    @Test
    public void scoreDetermination() {
        c.scoreDetermination();
        System.out.println("This is the result: \n" + c.getLetterGradeList());
        for (int s : c.getScoreList()) {
            String letterGrade = c.getLetterGradeList().get(s);
            if (s < 0 || s > 100) assertEquals(letterGrade, "ERROR");
            else if (s >= 97) assertEquals(letterGrade, "A+");
            else if (s >= 93) assertEquals(letterGrade, "A");
            else if (s >= 90) assertEquals(letterGrade, "A-");

            else if (s >= 87) assertEquals(letterGrade, "B+");
            else if (s >= 83) assertEquals(letterGrade, "B");
            else if (s >= 80) assertEquals(letterGrade, "B-");

            else if (s >= 77) assertEquals(letterGrade, "C+");
            else if (s >= 73) assertEquals(letterGrade, "C");
            else if (s >= 70) assertEquals(letterGrade, "C-");

            else if (s >= 67) assertEquals(letterGrade, "D+");
            else if (s >= 63) assertEquals(letterGrade, "D");
            else if (s >= 59) assertEquals(letterGrade, "D-");
            else assertEquals(letterGrade, "F");
        }
    }
}