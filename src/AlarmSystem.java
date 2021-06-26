public class AlarmSystem {

    private SensorIntegerList allSensor;

    private Integer sensorsID;

    private String envName;

    private CentralAlarmSystem central;

    public AlarmSystem(CentralAlarmSystem central, String s) {
        this.central = central;
        this.envName = s;
        this.allSensor = new SensorIntegerList(5);
        this.sensorsID = 0;
    }

    public SensorMethods addAlarmSensor(String s) {

        SensorMethods temp = new SensorMethods(sensorsID++, s, this);
        allSensor.add(temp);
        return temp;
    }

    void printOutState(String s) {
        System.out.println(s);
    }

    public void activate() {

        printOutState("Activando  alarma  de  sensores  de " + envName);

        for (int i = 0; i < allSensor.getElements().length; i++) {
            if (allSensor.getElements()[i] != null) {
                allSensor.getElements()[i].setIsActivated(true);
                printOutState(allSensor.getElements()[i].toString() + " activado");

            }

        }

    }

    public void deactivate() {
        printOutState("Desactivando  alarma  de  sensores  de " + envName);

        for (int i = 0; i < allSensor.getElements().length; i++) {
            if (allSensor.getElements()[i] != null) {
                allSensor.getElements()[i].setIsActivated(false);

                printOutState(allSensor.getElements()[i].toString() + " desactivando");

            }

        }
    }

    public void callServices() {
        for (int i = 0; i < central.getEmergencyServices().length; i++) {
            if (central.getEmergencyServices()[i] != null) {
                printOutState("Llamando a " + central.getEmergencyServices()[i].name1 + " al " + central.getEmergencyServices()[i].number);

            }

        }

    }
}