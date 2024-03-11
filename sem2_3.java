public class sem2_3 {
    public static void main(String [] args)

    {
        System.out.println(isPolindrom ("хуета"));
    }

    static boolean isPolindrom(String s) {
        for (int i =0, k = s.length()-1; i<k; i++, k--){
            if (s.charAt(i) != s.charAt(k))

                return false;
            }
            return true;
        }

    }
