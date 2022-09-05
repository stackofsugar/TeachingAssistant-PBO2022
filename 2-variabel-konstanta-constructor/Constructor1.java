public class Constructor1 {
    private int num;
    private String word;

    Constructor1() {
        this.num = 20;
        this.word = "Hello";
    }

    public static void main(String[] args) {
        Constructor1 obj = new Constructor1();
        System.out.println(obj.num);   // 20
        System.out.println(obj.word);  // Hello
    }
}
