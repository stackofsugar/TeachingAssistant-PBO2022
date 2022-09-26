public class ExceptionRaisingFunction {
    static int divide(int lhs, int rhs) {
        if (rhs == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return (lhs / rhs);
    }

    public static void main(String[] args) {
        System.out.println(divide(10, 5));
        System.out.println(divide(0, 12));
        System.out.println(divide(120, 0));
    }
}
