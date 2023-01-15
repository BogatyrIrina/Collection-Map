public class Bus extends Transport<DriverC> implements Competing {

    Capacity capacity;

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    public Bus(String brand, String model, double engineCapacity, Capacity capacity) {
        super(brand, model, engineCapacity);
        this.capacity = capacity;
    }

    @Override
    public void startMoving() {
        System.out.println("Автобус начинает движение");
    }

    @Override
    public void finishMoving() {
        System.out.println("Автобус заканчивает движение");
    }

    @Override
    public void printType() {
        if (capacity == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Вместимость автобуса: " + capacity.getFrom() + " " + capacity.getTo());
        }
    }

    @Override
    public void repair() {
        for (Mechanic m: getListMechanic()) {
            if (m.getMachineTypes() == MachineTypes.BUS) {
                m.fixTheCar();
                System.out.println("Починить машину");
            }
        }
    }

    @Override
    public boolean service() {
        System.out.println("Автобус " + getBrand() + getModel() + " в диагностике не требуется.");
        return true;
    }

    @Override
    public void pitStop() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " сделал пит-стоп");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " показал лучшее время круга: ");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " проехал с максимальной скорость: ");
    }
    public enum Capacity{
        ESPECIALLY_SMALL(0,10),
        SMALL(10, 25),
        MIDDLE(40, 50),
        LARGE(60,80),
        ESPECIALLY_LARGE(100,120);

        private final int from;
        private final int to;


        Capacity(int from, int to) {
            this.from = from;
            this.to = to;
        }

        public int getFrom() {
            return from;
        }

        public int getTo() {
            return to;
        }
    }
}
