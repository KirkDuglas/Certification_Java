import java.util.*;

public class sem3_3 {
    public static void main(String[] args) {
        task3();
    }

    static void task3() {
        List list = new ArrayList<>();
        list.add(12);
        list.add(12.23);
        list.add("hriicm");
        list.add("kodkjdlkjkls");
        list.add(945946);
        list.add("hueta");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object o = iterator.next();
            if (!(o instanceof Integer)) {
                iterator.remove();
            }
        }
System.out.println(list);
        
    }
}
