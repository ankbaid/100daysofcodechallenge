import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Isogram {
    public static void main(String[] args) {
        System.out.println(isIsogram(""));
    }
    public static boolean  isIsogram(String str) {
        if(str.length() == 0) return true;
        final String[] strArr = str.toLowerCase().split("");
        Set<String> strSet = new HashSet<>(Arrays.asList(strArr));
        return strSet.size() == str.length();

    }
}
