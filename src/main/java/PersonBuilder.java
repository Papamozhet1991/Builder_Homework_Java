public class PersonBuilder implements PersonBuilderInt{

    private String name;
    private String surname;
    private Integer age;
    private String city;

    @Override
    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    @Override
    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    @Override
    public PersonBuilder setAddress(String city) {
        this.city = city;
        return this;
    }

    @Override
    public Person build() {
        Person person = new Person(name, surname, age, city);
        if (person.getName() == null || person.getSurname() == null) {
            throw new IllegalStateException("Указаны не все обязательные данные!");
        }
        if (person.getAge() > 110 || person.getAge() < 0) {
            throw new IllegalArgumentException("Данные указаны не верно!");
        }
        return person;
    }
}

