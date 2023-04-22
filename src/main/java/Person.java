
public class Person {

    private String name;
    private String surname;
    private Integer age;
    private String city;

    public Person() {
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this(name, surname);
        this.age = age;
    }

    public Person(String name, String surname, String city) {
        this(name, surname);
        this.city = city;
    }

    public Person(String name, String surname, int age, String city) {
        this(name, surname, age);
        this.city = city;
    }

    public boolean hasAge() {
        return this.age != null;
    }

    public boolean hasCity() {
        return this.city != null;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        if (hasCity()) {
            return city;
        }
        return "Город не указан!";
    }

    public void setAddress(String city) {
        this.city = city;
    }

    public void happyBirthday() {
        if (hasAge()) {
            this.age += 1;
        } else {
            System.out.println("Возраст не указан!");
        }
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder().setSurname(surname).setAddress(city).setAge(0);
    }

    @Override
    public String toString() {
        return "Person {" +
                "Имя = '" + name + '\'' +
                ", фамилия = '" + surname + '\'' +
                ", возраст = " + (hasAge() ? age : "не указан") +
                ", город = '" + (hasCity() ? city : "не указан") + '\'' +
                '}';
    }
}