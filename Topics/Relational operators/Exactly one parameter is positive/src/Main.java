import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        boolean x1 = n1 > 0;
        boolean x2 = n2 > 0;
        boolean x3 = n3 > 0;
        System.out.println(!x1 && !x2 && x3 || !x1 && x2 && !x3 || x1 && !x2 && !x3);
    }

}