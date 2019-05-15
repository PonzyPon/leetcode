package survey.no4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int a = sc.nextInt();
        // スペース区切りの整数の入力
        int b = sc.nextInt();
        int c = sc.nextInt();
        // 文字列の入力
        String s = sc.next();

        sc.close();
        // 出力
        System.out.println((a + b + c) + " " + s);
    }

    private void testy() {
        System.out.println("arigato");
    }

    public class Animal {
        public void test() {
            System.out.println("asdfasdfa");
        }
    }

    public class Dog extends Animal {

        @Override
        public void test() {
            super.test();
        }
    }

}
