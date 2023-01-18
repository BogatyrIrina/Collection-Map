import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        List<Transport> transports = new ArrayList<>();
        transports.add(new Car("Lada", "Granta", 1.7, Car.BodyType.SEDAN));
        transports.add(new Car("Audi", "A8 50 L TDI quattro", 3.0, Car.BodyType.SEDAN));
        transports.add(new Car("BMW", "Z8", 3.0, Car.BodyType.SEDAN));
        transports.add(new Car("Kia", "Sportage 4 поколение", 2.4, Car.BodyType.SEDAN));
        transports.add(new Bus("MAN", "Lion's City", 1.7, Bus.Capacity.MIDDLE));
        transports.add(new Bus("Citroen", "Jumper II", 2.0, Bus.Capacity.SMALL));
        transports.add(new Bus("Mercedes-Benz", "Sprinter Classic", 1.7, Bus.Capacity.MIDDLE));
        transports.add(new Bus("Toyota", "Coaster", 2.0, Bus.Capacity.MIDDLE));
        transports.add(new Truck("КАМАЗ", "4310", 5, Truck.Carrying.N3));
        transports.add(new Truck("БелАЗ", "75710", 5.5, Truck.Carrying.N3));
        transports.add(new Truck("ЗИЛ", "130", 5, Truck.Carrying.N3));
        transports.add(new Truck("МАЗ", "7310", 6, Truck.Carrying.N3));


        List<Driver> drivers = new ArrayList<>();
        drivers.add(new DriverB("Иванов", "Иван", "Иванович", "Категория В", 20));
        drivers.add(new DriverC("Петров", "Петр", "Петрович", "Категория С", 20));
        drivers.add(new DriverD("Сидоров", "Сидор", "Сидорович", "Категория D", 20));

        List<Mechanic> mechanics = new ArrayList<>();
        mechanics.add(new Mechanic("Семен", "Семенов", "Автоплюс", MachineTypes.CAR));
        mechanics.add(new Mechanic("Степан", "Степанов", "Автогарант", MachineTypes.BUS));
        mechanics.add(new Mechanic("Антон", "Антонов", "Автоэкспресс", MachineTypes.TRUCK));

//        System.out.println(transports);



        Map<Transport, Mechanic> TransportMechanicMap = new HashMap<>();

        Mechanic mechanic1 = new Mechanic("Семен", "Семенов", "Автоплюс", MachineTypes.CAR);
        Mechanic mechanic2 = new Mechanic("Степан", "Степанов", "Автогарант", MachineTypes.BUS);
        Mechanic mechanic3 = new Mechanic("Антон", "Антонов", "Автоэкспресс", MachineTypes.TRUCK);

        Transport transport1 = new Car("Lada", "Granta", 1.7, Car.BodyType.SEDAN);
        Transport transport2 = new Car("Audi", "A8 50 L TDI quattro", 3.0, Car.BodyType.SEDAN);
        Transport transport3 = new Car("BMW", "Z8", 3.0, Car.BodyType.SEDAN);
        Transport transport4 = new Car("Kia", "Sportage 4 поколение", 2.4, Car.BodyType.SEDAN);


        TransportMechanicMap.put(transport1, mechanic1);
        TransportMechanicMap.put(transport2, mechanic2);
        TransportMechanicMap.put(transport3, mechanic3);
        TransportMechanicMap.put(transport4, mechanic1);


        System.out.println(TransportMechanicMap);


//        Car granta = new Car("Lada", "Granta", 1.7, Car.BodyType.SEDAN);
//        granta.printTransport();
//        granta.printType();

//        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, Car.BodyType.SEDAN);
//        audi.printTransport();
//        audi.printType();
//
//        Car bmw = new Car("BMW", "Z8", 3.0, Car.BodyType.SEDAN);
//        bmw.printTransport();
//        bmw.printType();
//
//        Car kia = new Car("Kia", "Sportage 4 поколение", 2.4, Car.BodyType.SEDAN);
//        kia.printTransport();
//        kia.printType();
//
//        Bus man = new Bus("MAN", "Lion's City", 1.7, Bus.Capacity.MIDDLE);
//        man.printTransport();
//        man.printType();

//        Bus citroen = new Bus("Citroen", "Jumper II", 2.0, Bus.Capacity.SMALL);
//        citroen.printTransport();
//        citroen.printType();
//
//        Bus mercedes = new Bus("Mercedes-Benz", "Sprinter Classic", 1.7, Bus.Capacity.MIDDLE);
//        mercedes.printTransport();
//        mercedes.printType();
//
//        Bus toyota = new Bus("Toyota", "Coaster", 2.0, Bus.Capacity.MIDDLE);
//        toyota.printTransport();
//        toyota.printType();
//
//        Truck kamaz = new Truck("КАМАЗ", "4310", 5, Truck.Carrying.N3);
//        kamaz.printTransport();
//        kamaz.printType();
//
//        Truck belaz = new Truck("БелАЗ", "75710", 5.5, Truck.Carrying.N3);
//        belaz.printTransport();
//        belaz.printType();
//
//        Truck zil = new Truck("ЗИЛ", "130", 5, Truck.Carrying.N3);
//        zil.printTransport();
//        zil.printType();
//
//        Truck maz = new Truck("МАЗ", "7310", 6, Truck.Carrying.N3);
//        maz.printTransport();
//        maz.printType();
//
//
//        DriverB ivanov = new DriverB("Иванов", "Иван", "Иванович", "Категория В", 20);
//        granta.drive(ivanov);
//
//
//        DriverC petrov = new DriverC("Петров", "Петр", "Петрович", "Категория С", 20);
//        man.drive(petrov);


//        DriverD sidorov = new DriverD("Сидоров", "Сидор", "Сидорович", "Категория D", 20);
//        kamaz.drive(sidorov);

//        service(granta, audi, bmw, kia,
//                man, citroen, mercedes, toyota,
//                kamaz, belaz, zil, maz);
//    }
//
//    private static void service(Transport... transports) {
//        for (Transport transport : transports) {
//            serviceTransport(transport);
//        }
//    }
//
//    private static void serviceTransport(Transport transport) {
//        try {
//            if (!transport.service()) {
//                throw new RuntimeException("Автомобиль " + transport.getBrand() + " "
//                        + transport.getModel() + " не прошел диагностику.");
//            }
//        } catch (RuntimeException e) {
//            System.out.println(e.getMessage());
//        }
    }
}