import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        TabCalculator tc = new TabCalculator();
        System.out.println(Arrays.toString(tc.processTab(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 9, 9}, 3)));
    }

}
