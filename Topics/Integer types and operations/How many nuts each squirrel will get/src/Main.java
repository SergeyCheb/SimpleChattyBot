import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sqrl = scanner.nextInt();
        int nuts = scanner.nextInt();
        System.out.println(nuts / sqrl);
    }
}