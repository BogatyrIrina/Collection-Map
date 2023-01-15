public class DriverC extends Driver {


    public DriverC(String firstName, String middleName, String lastName, String drivingLicense, int experience) {
        super(firstName, middleName, lastName, drivingLicense, experience);
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель с правами категории C начинает движение");
    }

    @Override
    public void finishMoving() {
        System.out.println("Водитель с правами категории C начинает движение");
    }

    @Override
    public void refuel() {
        System.out.println("Водитель с правами категории C заправляет траснпортное средство");
    }
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
