class Parent {
    private String name = "Someone";
    private String address = "Somewhere";

    public String introduce() {
        return name + " from " + address;
    }
}

class Child extends Parent {
    public void play() {
        System.out.println("Yay!");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        System.out.println(parent.introduce());
        System.out.println(child.introduce());
        child.play();
    }
}