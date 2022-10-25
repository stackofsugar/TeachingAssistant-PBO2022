class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String getInfo() {
        return "I am " + name + " aged " + String.valueOf(age);
    }

    public static void main(String[] args) {
        Person[] people = new Person[3];

        people[0] = new Person("Jessica", 21);
        people[1] = new Person("Amanda", 19);
        people[2] = new Person("Jack", 26);

        for (Person person : people) {
            System.out.println(person.getInfo());
        }
    }
}