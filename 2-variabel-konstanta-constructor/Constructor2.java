public class Constructor2 {
    String name;
    int age;
    double salary;

    Constructor2(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    void printData() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Salary: " + this.salary);
    }

    public static void main(String[] args) {
        Constructor2 obj = new Constructor2("Bobby", 20, 50.05);
        obj.printData();

        /*
         * Output:
         * Name: Bobby
         * Age: 20
         * Salary: 50.05
         */
    }
}
