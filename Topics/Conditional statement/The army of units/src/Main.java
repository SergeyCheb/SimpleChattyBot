import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i < 1)
            System.out.println("no army");
        else if (i >= 1 && i < 20)
            System.out.println("pack");
        else if (i >= 20 && i < 250)
            System.out.println("throng");
        else if (i >= 250 && i < 1000)
            System.out.println("zounds");
        else
            System.out.println("legion");
    }
}