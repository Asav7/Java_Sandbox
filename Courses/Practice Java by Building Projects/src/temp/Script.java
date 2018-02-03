package temp;

import java.util.Scanner;

/**
 * Created by Albert on 02.02.2018.
 */
public class Script {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String value = in.next();
        System.out.println(value);
        System.out.println(value != "Q");
    }
}
