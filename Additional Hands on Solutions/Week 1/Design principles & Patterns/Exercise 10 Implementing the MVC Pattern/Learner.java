public class Learner {
    private String fullName;
    private int rollNumber;
    private String score;

    public Learner(String fullName, int rollNumber, String score) {
        this.fullName = fullName;
        this.rollNumber = rollNumber;
        this.score = score;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
