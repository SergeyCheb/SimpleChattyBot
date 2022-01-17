import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amnt1 = scanner.nextInt();
        int amnt2 = scanner.nextInt();
        int amnt3 = scanner.nextInt();
        System.out.println(amnt1 / 2 + amnt1 % 2 + amnt2 / 2 + amnt2 % 2 +
                amnt3 / 2 + amnt3 % 2);
    }
}