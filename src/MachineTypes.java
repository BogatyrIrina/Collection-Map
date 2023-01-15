public enum MachineTypes {
    CAR("Легковые автомобили"),
    BUS("Автобусы"),
    TRUCK("Грузовые автомобили");


    private final String machineTypes;

    MachineTypes(String machineTypes) {
        this.machineTypes = machineTypes;
    }

    public String getMachineTypes() {
        return machineTypes;
    }
}
