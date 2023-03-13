package OOP.DZ1;

public class Person {
    private String fullName;
    //private Union union;
    //private String birthday;

    public Person(String fullName) {
        this(fullName, Union.none, "-");
    }

    public Person(String fullName, String birthday) {
        this(fullName, Union.none, birthday);

    }

    public Person(String fullName, Union union, String birthday) {
        this.fullName = fullName;
        //this.union = union;
        //this.birthday = birthday;
    }

    public String getFullName() {
        return fullName;
    }
}