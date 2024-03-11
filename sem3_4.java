import java.util.*;

public class sem3_4 {
    static List<ArrayList<String>> cat = new ArrayList<>();
    public static void main(String[] args) {
       
        addBook("Фэнтэзи", "Гарри Поттер");
        addBook("Фэнтэзи", "Гарри Поттер 2");
        addBook("Фантастика", "терминатор");
        addBook("Роман", "Потрахушки в городе N");
        System.out.println(cat);
    }

    static void addBook (String genre, String[] book) {
        ArrayList<String> cur = null;
        for (ArrayList<String> s: cat)
        if (s.get(0).equals(genre))
        {
            cur = s;
            cur.add(book);
            return;
        }
    
        cur = new ArrayList<>();
        cur.add(genre);
        cat.add(cur);
        cur.add(book);
    
    
    }
}
