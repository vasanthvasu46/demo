package Collection_Queue;
import java.util.*;


public class Deque_Hackerrank {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<Integer>();
        int n = in.nextInt();
        int m = in.nextInt();


        int max = 0;



        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();

            deque.add(num);
            set.add(num);

            if (deque.size() == m + 1) {

                int a = (int) deque.remove();

                if (!deque.contains(a)) {
                    set.remove(a);
                }

            }
            max = Math.max(set.size(), max);
        }
        System.out.println(max);
    }
}
