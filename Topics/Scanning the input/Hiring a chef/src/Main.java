import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fName = scanner.next();
        String exp = scanner.next();
        String pref = scanner.next();
        System.out.println("The form for " + fName + " is completed. " +
                "We will contact you if we need a chef who cooks " +
                pref + " dishes and has " + exp + " years of experience.");
    }
}