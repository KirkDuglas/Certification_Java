public class sem2_2 {
    public static void main(String[] args){

    String str = "aaaabbbcdd";
    System.out.println(pack(str));
    }
    public static String pack(String str) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        char c = str.charAt(0);
        
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == c)
                count++;
            else {
                sb.append(c).append(count);
                count = 1;
                c = str.charAt(i);
            }
            
        }
            sb.append(c).append(count);
            return sb.toString();
    }
}
