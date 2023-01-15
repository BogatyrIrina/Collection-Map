import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Transport<T extends Driver> {
    private final String brand;
    private final String model;
    private double engineCapacity;
    private final List<Mechanic> listMechanic = new ArrayList<>();

    public Transport(String brand, String model, double engineCapacity) {
        this.brand = brand;
        this.model = model;
        this.engineCapacity = engineCapacity;
    }

    public abstract void startMoving();

    public abstract void finishMoving();

    public abstract void printType();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public List<Mechanic> getListMechanic() {
        return listMechanic;
    }


    public void drive(T driver) {
        System.out.println("Водитель ФИО: " + driver.getFirstName() + " " + driver.getMiddleName() + " "
                + driver.getLastName() + ". Управляет транспортным средством " + getBrand() + " " + getModel() +
                ". Будет учавстовать в заезде. ");
    }

    public abstract void repair ();

    public void printTransport(){
        System.out.println("Марка автомобиля " + getBrand() +
                ", модель " + getModel() +
                ", объем двигателя " + getEngineCapacity());
    }

    @Override
    public String toString() {
        return "Transport.Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineCapacity=" + engineCapacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport<T> transport = (Transport<T>) o;
        return Double.compare(transport.engineCapacity, engineCapacity) == 0
                && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineCapacity);
    }

    public void setEngineCapacity(double engineCapacity) {
        if (engineCapacity <= 0) {
            this.engineCapacity = 1.5;
        } else {
            this.engineCapacity = engineCapacity;
        }
    }
    public abstract boolean service();

    public void addMechanic(Mechanic mechanic){
        if (!listMechanic.contains(mechanic)) {
            listMechanic.add(mechanic);
        }
    }
}
