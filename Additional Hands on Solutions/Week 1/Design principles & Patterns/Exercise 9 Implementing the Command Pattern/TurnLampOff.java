
public class TurnLampOff implements Action {
    private LampDevice device;

    public TurnLampOff(LampDevice device) {
        this.device = device;
    }

    @Override
    public void run() {
        device.switchOff();
    }
}
