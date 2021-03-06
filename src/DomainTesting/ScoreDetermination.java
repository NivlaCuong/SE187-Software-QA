package DomainTesting;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * A Class that will determine the score of a student
 */
public class ScoreDetermination {

    private int testPercentage;
    private ArrayList<Integer> scoreList, newScoreList;
    private HashMap<Integer, String> letterGradeList;


    /**
     * Constructor that will initialize the class
     */
    ScoreDetermination(int testPercent) {
        scoreList = new ArrayList<>();
        newScoreList = new ArrayList<>();
        letterGradeList = new HashMap<>();
        testPercentage = testPercent;
    }

    /**
     * A function that takes the student's score and give a letter grade for the specific number grade
     * @return a Letter Grade
     */
    void scoreDetermination() {
        for (int i : scoreList) {
            String result;
            int score = (i * 100) / testPercentage;

            if (score < 0 || score > 100) result = "ERROR";
            else if (score >= 97) result = "A+";
            else if (score >= 93) result = "A";
            else if (score >= 90) result = "A-";

            else if (score >= 87) result = "B+";
            else if (score >= 83) result = "B";
            else if (score >= 80) result = "B-";

            else if (score >= 77) result = "C+";
            else if (score >= 73) result = "C";
            else if (score >= 70) result = "C-";

            else if (score >= 67) result = "D+";
            else if (score >= 63) result = "D";
            else if (score >= 59) result = "D-";
            else result = "F";

            System.out.println("Original = " + i + " - New Score = " + score + "% - result = " + result);
            newScoreList.add(score);
            letterGradeList.put(score, result);
        }
    }

    public int getTestPercentage() {
        return testPercentage;
    }


    public ArrayList<Integer> getScoreList() {
        return scoreList;
    }

    public ArrayList<Integer> getNewScoreList() {
        return newScoreList;
    }

    void addScore(int score) {
        scoreList.add(score);
    }

    public HashMap<Integer, String> getLetterGradeList() {
        return letterGradeList;
    }
}
