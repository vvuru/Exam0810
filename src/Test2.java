import java.util.ArrayList;
import java.util.List;

public class Test2 {
    // class body
    int sum = 0;
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        // var list = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        list.forEach(str->{
            // final int sum = 0;
            sum += str;
        });
        System.out.println(sum);
        
    }
}
