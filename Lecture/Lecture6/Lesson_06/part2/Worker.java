package Lesson_06.part2;

public class Worker {
    int id;
    int salary;
    String firstName;
    String lastName;

    @Override
    public String toString() {
        return String.format("%d %s %s %d", id, firstName, lastName, salary);
    }

    @Override
    public boolean equals(Object o) {
        var t = (Worker) o;
        return id == t.id && firstName == t.firstName;
    }
    @Override
    public int hashCode() {
        return id;
    }
}

// Brand -
// OS - Windows, macOS, Linux
// Color - Black, White, Gold, Silver
// Price
// Ram - DDR, DDR2, DDR3, DDR4 and DDR5
// Processor - AMD, Intel
// Drive - SSD, HDD
// Screen - OLED, IPS, VA, TN
// Article