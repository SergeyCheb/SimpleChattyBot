import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int begRange = scanner.nextInt();
        int endRange = scanner.nextInt();
        double rez = 0;
        int count = 0;
        for (int i = begRange; i <= endRange; ++i) {
            if (i % 3 == 0) {
                rez += i;
                ++count;
            }
        }
        System.out.println(rez / count);
    }
}