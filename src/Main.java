public class Main {

    public static void test(Integer a) {
        a += 5;
    }
    public static void main(String[] args) {
        Integer a = new Integer(5);
        test(a);
        System.out.println(a);
    }
}