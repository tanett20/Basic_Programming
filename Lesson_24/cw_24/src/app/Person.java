package app;

public class Person {
    String firstName;
    String lastName;
    MyDate birthday;

    public Person(String fName, String lName, MyDate b){
        firstName = fName;
        lastName = lName;
        birthday = b;
    }
}