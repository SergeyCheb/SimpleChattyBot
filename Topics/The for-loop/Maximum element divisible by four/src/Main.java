import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();
        int maxValue = 0;
        for (int i = 0; i < quantity; ++i) {
            int val = scanner.nextInt();
            if (val % 4 == 0 && val > maxValue) {
                maxValue = val;
            }
        }
        System.out.println(maxValue);
    }
}