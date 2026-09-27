package software.ulpgc.kata1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Julio Zheng", LocalDate.of(1973, 11, 28));
        System.out.println(person);
    }
}
