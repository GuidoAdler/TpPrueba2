public enum EmergencyServices {
    POLICE(911, "Policia"),
    FIRE(100, "Bomberos"),
    HEALTH(107, "Ambulancia");

    private EmergencyServices(int i, String name1) {
        this.name1 = name1;
        this.number = i;
    }
    public final String name1;
    public final Integer number;

}