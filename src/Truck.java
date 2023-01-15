public class Truck extends Transport<DriverD> implements Competing{

    Carrying carrying;

    public Carrying getCarrying() {
        return carrying;
    }

    public void setCarrying(Carrying carrying) {
        this.carrying = carrying;
    }

    public Truck(String brand, String model, double engineCapacity, Carrying carrying) {
        super(brand, model, engineCapacity);
        this.carrying = carrying;
    }

    @Override
    public void startMoving() {
        System.out.println("Грузовик начинает движение");
    }

    @Override
    public void finishMoving() {
        System.out.println("Грузовик заканчивает движение");
    }

    @Override
    public void printType() {
        if (carrying == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            String from = carrying.getFrom() == null?"":" от " + carrying.getFrom();
            String to = carrying.getTo() == null?"":" от " + carrying.getTo();
            System.out.println("Грузоподъемность: " + from + " " + to);
        }
    }

    @Override
    public void repair() {
        for (Mechanic m: getListMechanic()) {
            if (m.getMachineTypes() == MachineTypes.TRUCK) {
                m.fixTheCar();
                System.out.println("Починить машину");
            }
        }
    }

    @Override
    public boolean service() {
        return Math.random() > 0.75;
    }

    @Override
    public void pitStop() {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " делает пит-стоп");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Тягач " + getBrand() + " " + getModel() + " лучшее время круга составило ");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " поехал с максимальной скорость: " );
    }
    public enum Carrying {
        N1(0.0, 3.5),
        N2(3.5,12.0),
        N3(12.0, null);
        private final Double From;
        private final Double To;

        Carrying(Double from, Double to) {
            From = from;
            To = to;
        }

        public Double getFrom() {
            return From;
        }

        public Double getTo() {
            return To;
        }
    }
}
