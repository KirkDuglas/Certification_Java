public class sem2 {
    public static void main(String[] args) {
        int n = 100_000;
        char c1 = 'G';
        char c2 = 'B';
        
        long start = System.currentTimeMillis();
        getSem2Str(n, c1, c2);
        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        getSem2Sb(n, c1, c2);
        System.out.println(System.currentTimeMillis() - start);
    }

    public static String getSem2Str(int n, char c1, char c2) {
        String str = "";
        for (int i = 0; i < n / 2; i++) {
            str += Character.toString (c1) + Character.toString (c2);
        }
        return str;
    }
    public static String getSem2Sb(int n, char c1, char c2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n / 2; i++) {
            sb.append(c1).append(c2);
        }
            return sb.toString();
        }
    {
        
    }
}
