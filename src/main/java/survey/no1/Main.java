package survey.no1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base10 = sc.nextInt();
        sc.close();
        System.out.println(convertBase10ToBase11(base10));
    }

    private static String convertBase10ToBase11(int num) {
        String base11 = Integer.toString(num, 11);
        return base11;
    }

}
