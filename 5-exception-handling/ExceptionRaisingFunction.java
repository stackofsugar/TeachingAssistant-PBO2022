public class ExceptionRaisingFunction {
    static int divide(int lhs, int rhs) {
        if (rhs == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return (lhs / rhs);
    }

    static int other(int lhs, int rhs) {
        int division = divide(lhs, rhs);
        return division - (lhs + rhs);
    }

    public static void main(String[] args) {
        // System.out.println(divide(10, 5));
        // System.out.println(divide(0, 12));
        // try {
        // System.out.println(divide(120, 0));
        // } catch (Exception e) {
        // System.out.println(e.getMessage());
        // }
        // System.out.println("Hello World");

        System.out.println(other(10, 0));
    }
}
