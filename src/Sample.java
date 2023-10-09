public class Sample {
    int outbox1 = 7;
    static int outbox2 = 5;

    public static void main(String[] args) {
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        // overflow
        System.out.println(--min);
        System.out.println(++max);

    }
}
