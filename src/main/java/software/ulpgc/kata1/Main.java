package software.ulpgc.kata1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Michael Robleis", LocalDate.of(1999, 9, 1));
        System.out.println(person);
    }
}
