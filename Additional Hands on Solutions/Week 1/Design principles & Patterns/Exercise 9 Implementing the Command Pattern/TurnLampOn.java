
public class TurnLampOn implements Action {
    private LampDevice device;

    public TurnLampOn(LampDevice device) {
        this.device = device;
    }

    @Override
    public void run() {
        device.switchOn();
    }
}
