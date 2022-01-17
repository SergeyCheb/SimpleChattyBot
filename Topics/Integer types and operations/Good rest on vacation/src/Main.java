import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amountDays = scanner.nextInt();
        int costFood = scanner.nextInt();
        int costFly = scanner.nextInt();
        int costNight = scanner.nextInt();
        System.out.println(amountDays * costFood + (amountDays - 1) * costNight +
                2 * costFly);
    }
}