package Seminar.Seminar6;

public class task3 {

    public static void main(String[] args) {

        String name = "BARS";

        Cat bars = new Cat("Pavel", "+3-44-44-44-44", name, "MALE", "MAKECOON", 2);
        System.out.println(bars.getName());
        System.out.println(bars.sex);
        System.out.println(bars.breed);
        System.out.println(bars.mass);
        System.out.println(bars.age + " years");
        bars.currentWeight(6.2f);
        System.out.println(bars.mass);

        Cat moor = new Cat("MOOR", 5);
        System.out.println(moor.getName() + " " + moor.age + " years");

    }
}

class Cat {
    // private Integer id; // Идентификационный номер
    private String name; // имя
    Integer age; // возраст
    String sex; // пол
    Float mass; // вес
    String breed; // порода
    boolean registered; // регистрация
    String nameMaster; // ФИО хозяина
    String telephone; // телефон

    public Cat(String petName, Integer petAge) {
        this.name = petName;
        this.age = petAge;
    }

    public Cat(String master, String getPhone, String petName,
            String petSex, String petBreed, Integer petAge) {
        this.registered = true;
        this.nameMaster = master;
        this.telephone = getPhone;
        this.name = petName;
        this.sex = petSex;
        this.breed = petBreed;
        this.age = petAge;
    } // зарегистрировать

    public void currentWeight(Float weight) {
        this.mass = weight;
    } // взвесить

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }

    public Float getMass() {
        return this.mass;
    }

    // привить
    // стелиризовать
    // мяукнуть (громкость, интерации)
    // сдать анализы
    // выбрить область
    // хирургическая опреация (часть тела)
    // наложить гипс (часть тела)
    // наркоз
    // добавить в БД кота для статистки
    // чипировать

}