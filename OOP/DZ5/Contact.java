package OOP.DZ5;

public class Contact implements Printable{
    private String name;
    private String surname;
    private String phoneNumber;

    public Contact() {
    }

    public Contact(String name, String surname, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
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
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    @Override
    public String toString() {
        return name + " " + surname + " " + phoneNumber;
    }
    @Override
    public void print() {
        System.out.println(this.toString());
    }
}