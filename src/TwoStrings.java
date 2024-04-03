import java.util.HashSet;

public class TwoStrings {
    public static void main(String[] args) {

        String stringOne = "hellodoll";
        String stringTwo = "dollywood";

        HashSet<Character> set = new HashSet<>();

        for(char c : stringOne.toCharArray()) {
            set.add(c);
        }

        for(char c : stringTwo.toCharArray()) {
            if (set.contains(c)) {
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
    }
}
