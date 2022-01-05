public class Troll {
    public static void main(String[] args) {
        System.out.println(disemvowel("Hello"));
    }
    public static String disemvowel(String str) {
        return str.replaceAll("[aAeEiIoOuU]", "");
    }
}