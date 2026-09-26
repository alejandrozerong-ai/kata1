package software.ulpgc.kata1;

import java.time.LocalDate;

public class Person {
    private final String name;
    private final LocalDate birthDate;


    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getAge() {
        return toYears(LocalDate.now().toEpochDay() - birthDate.toEpochDay());
    }

    private int toYears(long days) {
        return (int) (days / 365.25);
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", birthDate=" + birthDate + ", age=" + getAge() + "]";
    }
}
