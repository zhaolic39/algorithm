package str;

import java.util.ArrayList;
import java.util.List;

/**
 * DFS分割子字符串
 */
public class SubStringDFS {

    private static List<List<String>> answer = new ArrayList<>();
    private static int n = 0;

    private static List<List<String>> partition(String s){
        n = s.length();
        List<String> item = new ArrayList<>();
        dfs(s, item);
        return answer;
    }

    private static void dfs(String s, List<String> item){
        if(check(s, item)){
            System.out.println(item + "," + s);
            List<String> cur = new ArrayList<>(item);
            cur.add(s);
            answer.add(cur);
        }

        for(int i=1;i<s.length();i++){
            String a = s.substring(0, i);
            item.add(a);
            dfs(s.substring(i, s.length()), item);
            item.remove(item.size() - 1);
        }
    }

    private static boolean check(String s, List<String> item){
        int m = 0;
        for(String a : item){
            m += a.length();
        }
        if(n == (m + s.length())){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        String s = "abcdefg";
        List<List<String>> result = partition(s);
        System.out.println(result);
    }
}
