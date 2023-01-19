import java.util.Objects;

public class Mechanic {
    private String name;
    private String surname;
    private String company;
    private MachineTypes machineTypes;

    public Mechanic(String name, String surname, String company, MachineTypes machineTypes) {
        this.name = name;
        this.surname = surname;
        this.company = company;
        this.machineTypes = machineTypes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public MachineTypes getMachineTypes() {
        return machineTypes;
    }

    public void setMachineTypes(MachineTypes machineTypes) {
        this.machineTypes = machineTypes;
    }

    public void carryOutMaintenance() {
        System.out.println(getName() + " из компании " + getCompany() + "проводит техобслуживание");
    }

    public void fixTheCar() {
        System.out.println(getName() + " из компании " + getCompany() + "чинит автомобиль");
    }
    @Override
    public String toString() {
        return "Mechanic.Mechanic{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", company=" + company +'\'' +
                ", machineTypes=" + machineTypes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic mechanic = (Mechanic) o;
        return Objects.equals(name, mechanic.name) && Objects.equals(surname, mechanic.surname) && Objects.equals(company, mechanic.company) && machineTypes == mechanic.machineTypes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, company, machineTypes);
    }
}
