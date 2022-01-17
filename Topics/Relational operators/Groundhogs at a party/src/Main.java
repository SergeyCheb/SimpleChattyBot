import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        // You can use scanner.nextBoolean() to read a boolean value
        int peanut = scanner.nextInt();
        boolean isWeek = scanner.nextBoolean();
        boolean notWeek = peanut >= 10 && peanut <= 20 && !isWeek;
        boolean week = peanut >= 15 && peanut <= 25 && isWeek;
        System.out.println(notWeek || week);
    }
}