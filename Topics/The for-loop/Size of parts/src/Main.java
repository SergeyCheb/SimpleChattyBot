import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int fix = 0;
        int rej = 0;
        int ship = 0;
        for (int i = 0; i < count; ++i) {
            int det = scanner.nextInt();
            if (det == -1) {
                ++rej;
            }
            if (det == 1) {
                ++fix;
            }
            if (det == 0) {
                ++ship;
            }
        }
        System.out.println(ship + " " + fix + " " + rej);
    }
}