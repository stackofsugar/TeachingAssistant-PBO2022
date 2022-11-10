public class Encapsulation {
    public static void main(String[] args) {
        Person person = new Person();
        person.setname("Candy");
        System.out.println(person.getname());
    }
}

class Person {
    private String full_name;

    public Person() {
        full_name = "Name";
    }

    public String getname() {
        return full_name;
    }

    public void setname(String full_name) {
        this.full_name = full_name;
    }
}