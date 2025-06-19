
public class CommandPatternDemo {
    public static void main(String[] args) {

        System.out.println();

        // Target object that performs real actions
        LampDevice lamp = new LampDevice();

        // Action commands
        Action activate = new TurnLampOn(lamp);
        Action deactivate = new TurnLampOff(lamp);

        // Invoker that triggers commands
        RemoteInvoker remote = new RemoteInvoker();

        // Switch on the lamp
        remote.assignAction(activate);
        remote.trigger();

        // Switch off the lamp
        remote.assignAction(deactivate);
        remote.trigger();
    }
}
