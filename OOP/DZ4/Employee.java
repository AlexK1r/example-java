package OOP.DZ4;

import java.util.Objects;

public class Employee implements Printable {
    private String firstName;
    private String secondName;
    private Enum position;

    public Employee(String firstName, String secondName, Enum position) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.position = position;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public Enum getPosition() {
        return position;
    }

    public void setPosition(Enum position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.secondName + " " + this.position;
    }

    @Override
    public void print() {
        System.out.println(this.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(firstName, employee.firstName) && Objects.equals(secondName, employee.secondName) && Objects.equals(position, employee.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName, position);
    }
}
