package Method;

public class Method {


    public static boolean isPositiveAndEven(int n) {
        return n > 0 && n % 2 == 0;
    }

    public static boolean isNegAndMin10(int n) {
        return n < -10;
    }

    public static int sum(List<Integer> l) {
        return l.stream().filter(n -> isPositiveAndEven(n)).mapToInt(Integer::intValue).sum();
    }

    public static int mult(List<Integer> l) {
        return l.stream().filter(n -> isNegAndMin10(n)).reduce(1, (x, y) -> x * y);
    }

    public static void main(String[] args) {
        List<Integer> list = java.util.Arrays.asList(1, 2, -11, 0, -8, -15, 12, -11);
        System.out.println(mult(list));
    }

}
