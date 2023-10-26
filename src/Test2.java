public class Test2 {
    // class body
    public static void main(String[] args) {
        int [] arr = {3,4,5,6,7,8,9,10,11};
        int sum = 0;
        // code here
        for(int i : arr){
            sum += i;
        }
        System.out.println(sum);
        int avg = sum / arr.length;
        int num = sum % arr.length;
        System.out.println(avg + "." + num);
    }
}
