package str;

public class SubStringLoop {
    public static void main(String[] args) {
        String s = "adfwerwer";

        for(int i = 1; i<= s.length(); i++){
            for(int j = 0;j<i;j ++){
                System.out.println(s.substring(j, i));
            }
        }
    }
}
