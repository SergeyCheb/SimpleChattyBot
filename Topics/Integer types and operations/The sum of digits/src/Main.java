import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int hundr = num / 100;
        int tens = (num / 10) % 10;
        int ones = num % 10;
        System.out.println(hundr + tens + ones);
    }
}