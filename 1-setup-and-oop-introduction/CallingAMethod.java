public class CallingAMethod {
    private int myNum1 = 25;
    private int myNum2 = 40;

    public int add() {
        return myNum1 + myNum2;
    }

    public double divide() {
        return (double) myNum2 / (double) myNum1;
    }

    public int operate() {
        return ((myNum2 / 2) + (myNum1 - 12));
    }

    public static void main(String[] args) {
        CallingAMethod obj = new CallingAMethod();
        System.out.println("add(): " + obj.add());
        System.out.println("divide(): " + obj.divide());
        System.out.println("operate(): " + obj.operate());
    }
}
