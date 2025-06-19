public class AppRunner {
    public static void main(String[] args) {
        System.out.println();

        // Model creation
        Learner data = new Learner("John Doe", 1, "A");

        // View creation
        LearnerUI screen = new LearnerUI();

        // Controller setup
        LearnerController handler = new LearnerController(data, screen);

        // Display current student information
        handler.refreshView();

        // Modify data
        handler.updateName("Jane Smith");
        handler.updateGrade("B");

        // Show updated details
        handler.refreshView();
    }
}
