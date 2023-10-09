public class Sample {
    int outbox1 = 7;
    static int outbox2 = 5;

    public static void main(String[] args) {
        int box1 = 5;
        {
            int box2 = 2;
            System.out.println(box1);
            System.out.println(box2);
        }
//        System.out.println(box2);
//        System.out.println(outbox1);
    }
}
