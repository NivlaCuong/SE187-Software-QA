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
        c = new ScoreDetermination(25);
        Random random = new Random();
        for(int i = 0; i <= 50; i++) {
          int ranNum = random.nextInt(c.getTestPercentage() + 3) - 3;
          c.addScore(ranNum);
        }
    }


    /**
     * A Function will test to see if each random number grade is corresponded to the right letter Grade
     */
    @Test
    public void scoreDetermination() {
        System.out.println("Testing with " + c.getTestPercentage() + "% of the total grade\n");
        c.scoreDetermination();

        for (int s : c.getNewScoreList()) {
            String letterGrade = c.getLetterGradeList().get(s);
            if (s < 0 || s > 100) assertEquals(letterGrade, "ERROR");
            else if (s >= 97) assertEquals("A+", letterGrade);
            else if (s >= 93) assertEquals("A", letterGrade);
            else if (s >= 90) assertEquals("A-", letterGrade);

            else if (s >= 87) assertEquals("B+", letterGrade);
            else if (s >= 83) assertEquals("B", letterGrade);
            else if (s >= 80) assertEquals("B-", letterGrade);

            else if (s >= 77) assertEquals("C+", letterGrade);
            else if (s >= 73) assertEquals("C", letterGrade);
            else if (s >= 70) assertEquals("C-", letterGrade);

            else if (s >= 67) assertEquals("D+", letterGrade);
            else if (s >= 63) assertEquals("D", letterGrade);
            else if (s >= 59) assertEquals("D-", letterGrade);
            else assertEquals("F", letterGrade);
        }
    }
}