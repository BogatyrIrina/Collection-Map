public class Car extends Transport<DriverB> implements Competing {
    BodyType bodyType;

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public Car(String brand, String model, double engineCapacity, BodyType bodyType) {
        super(brand, model, engineCapacity);
        this.bodyType = bodyType;

    }

    @Override
    public void startMoving() {
        System.out.println("Автомобиль начинает движение");
    }

    @Override
    public void finishMoving() {
        System.out.println("Автомобиль заканчивает движение");
    }

    @Override
    public void printType() {
        if (bodyType == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Тип кузова автомобиля: " + bodyType);
        }
    }

    @Override
    public void repair() {
        for (Mechanic m: getListMechanic()) {
            if (m.getMachineTypes() == MachineTypes.CAR) {
                m.fixTheCar();
                System.out.println("Починить машину");
            }
        }
    }

    @Override
    public boolean service() {
        return Math.random() > 0.7;
    }

    @Override
    public void pitStop() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " делает пит-стоп");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + ": лучшее время круга составило: ");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + ": максимальная скорость составила : ");
    }

    public enum BodyType {
        SEDAN("Седан"),
        HATCHBACK("Хетчбек"),
        COUPE("Купе"),
        ESTATE("Универсал"),
        SUV("Внедорожник"),
        CUV("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MPVs("Минивэн");

        private final String bodyTypeRus;

        BodyType(String bodyTypeRus) {
            this.bodyTypeRus = bodyTypeRus;
        }

        public String getBodyTypeRus() {
            return bodyTypeRus;
        }
    }
}
