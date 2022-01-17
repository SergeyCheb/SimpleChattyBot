import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int firstPart = i / 100;
        int lastPart = i % 100;
        lastPart = lastPart / 10 + (lastPart % 10) * 10;

        if (firstPart == lastPart)
            System.out.println(1);
        else
            System.out.println(37);
    }
}