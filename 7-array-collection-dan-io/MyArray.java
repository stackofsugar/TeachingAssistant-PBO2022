public class MyArray {
    public static void main(String[] args) {
        String[] students = new String[3];

        students[0] = "James";
        students[1] = "Bambang";
        students[2] = "Monica";

        String[] other_students = { "Joko", "Charles", "Elizabeth" };

        System.out.println(students[2]);
        System.out.println(other_students[1]);

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        for (String student : students) {
            System.out.println(student);
        }

        int i = 0;
        while (i < students.length) {
            System.out.println(students[i]);
            i++;
        }
    }
}
