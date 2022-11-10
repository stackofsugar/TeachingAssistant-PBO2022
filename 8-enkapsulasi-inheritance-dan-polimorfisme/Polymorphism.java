class Parent {
    static public String myVariable = "Hello";
}

class Child extends Parent {
    static public int myVariable = 20;
}

public class Polymorphism {
    public static void main(String[] args) {
        System.out.println(Parent.myVariable);
        System.out.println(Child.myVariable);
    }
}