public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int sum = 0;

        sum = plus(a, b);
        System.out.println(sum);
    }

    public static int plus(int x, int y) {
        int result = x;

        for (int i = 0; i < y; i++) {
            result += 1;
        }

        return result;
    }
}
