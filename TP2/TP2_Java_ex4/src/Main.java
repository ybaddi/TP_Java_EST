import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) {
        Map<String, Integer> stringInt = new HashMap<String, Integer>();
        stringInt.put("Paris", 7);
        stringInt.put("Rome", 5);
        stringInt.put("Manchester", 1);
        stringInt.put("Barcelone", 3);
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrer la chaine de caractere");
        String str = sc.nextLine();
        StringTokenizer strTokens = new StringTokenizer(str," .");
        while(strTokens.hasMoreTokens()){
            String token = strTokens.nextToken();
            if(stringInt.containsKey(token)) str=str.replace(token, stringInt.get(token).toString());
        }
        System.out.println(str);
    }
}
