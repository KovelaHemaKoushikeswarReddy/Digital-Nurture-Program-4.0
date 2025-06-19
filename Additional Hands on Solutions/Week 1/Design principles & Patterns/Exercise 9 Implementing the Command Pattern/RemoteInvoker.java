
public class RemoteInvoker {
    private Action currentAction;

    public void assignAction(Action currentAction) {
        this.currentAction = currentAction;
    }

    public void trigger() {
        currentAction.run();
    }
}
