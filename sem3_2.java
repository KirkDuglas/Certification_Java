import java.util.*;

// import java.util.Array*;
// import java

public class sem3_2 {
    public static void main(String[] args) {
        // task1(10, 0, 9);
        task1 (10, 0, 9);
    }

    // public static void task1(int n, int min, int max) {
    //     List<Integer> list = new ArrayList<>();
    //     for (int i = 0; i < n; i++) {
    //         list.add(new Random().nextInt(min, max + 1));
    //     }
    //     Collections.sort(list);
    //     System.out.println(list);
    // }

    public static void task1(int n, int min, int max) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new Random().nextInt(min, max + 1));
        }
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}