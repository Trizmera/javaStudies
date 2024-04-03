import java.util.Arrays;

public class sockMerchant {
    public static void main(String[] args) {

        int[] pairs = {1, 2, 1, 2, 1, 3, 2};
        int count = 0;

        Arrays.sort(pairs);

        for (int i = 0; i < pairs.length - 1; i++) {
            if(pairs[i] == pairs[i + 1]) {
                count++;
                i++;
            }
        }

        System.out.println("Pairs:.." + count);
    }
}
