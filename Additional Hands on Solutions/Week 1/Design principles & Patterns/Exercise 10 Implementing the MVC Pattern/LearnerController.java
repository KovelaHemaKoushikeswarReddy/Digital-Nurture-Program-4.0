public class LearnerController {
    private Learner learner;
    private LearnerUI ui;

    public LearnerController(Learner learner, LearnerUI ui) {
        this.learner = learner;
        this.ui = ui;
    }

    public void updateName(String newName) {
        learner.setFullName(newName);
    }

    public String fetchName() {
        return learner.getFullName();
    }

    public void updateId(int newId) {
        learner.setRollNumber(newId);
    }

    public int fetchId() {
        return learner.getRollNumber();
    }

    public void updateGrade(String newScore) {
        learner.setScore(newScore);
    }

    public String fetchGrade() {
        return learner.getScore();
    }

    public void refreshView() {
        ui.renderLearnerData(learner.getFullName(), learner.getRollNumber(), learner.getScore());
    }
}
