package DomainTesting;

/**
 * A Class that will determine the score of a student
 */
public class ScoreDetermination {

    private int score;

    /**
     * Constructor that will initialize the score
     * @param score: An integer
     */
    ScoreDetermination(int score) {
        this.score = score;
    }

    /**
     * A function that takes the student's score and give a letter grade for the specific number grade
     * @return a Letter Grade
     */
    String scoreDetermination() {
        if (score >= 97) return "A+";
        else if (score > 93) return "A";
        else if (score >= 90) return "A-";

        else if (score >= 87) return "B+";
        else if (score >= 83) return "B";
        else if (score >= 80) return "B-";

        else if (score >= 77) return "C+";
        else if (score >= 73) return "C";
        else if (score >= 70) return "C-";

        else if (score >= 67) return "D+";
        else if (score >= 63) return "D";
        else if (score >= 59) return "D-";

        else return "F";
    }

    public int getScore() {
        return score;
    }

    public static void main(String[] args) {
        ScoreDetermination s = new ScoreDetermination(76);
        System.out.println(s.scoreDetermination());
    }
}
