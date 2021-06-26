public class SensorMethods extends Sensor {

    private AlarmSystem alarmSystem;
    private boolean isActivated;
    public SensorMethods(int id, String name) {
        super(id, name);
    }

    public SensorMethods(int id, String name, AlarmSystem alarmSystem) {
        super(id, name);
        this.alarmSystem = alarmSystem;
    }

    @Override
    public void motionDetected() {
        if (isActivated) {
            System.out.println(toString() + "  detectó movimiento");
            alarmSystem.callServices();
        }

    }

    public boolean getIsActivated() {
        return isActivated;
    }

    public void setIsActivated(boolean state) {
        isActivated = state;
    }

}