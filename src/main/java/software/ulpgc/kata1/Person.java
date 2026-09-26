package software.ulpgc.kata1;

import java.time.LocalDate;

public record Person(String name, LocalDate birthDate) {

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
