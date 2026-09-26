package software.ulpgc.kata1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alejandro Zerong", LocalDate.of(2005, 1, 7));
        System.out.println(person.toString());
    }
}
