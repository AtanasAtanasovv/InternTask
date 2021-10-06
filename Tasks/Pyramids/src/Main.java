import java.util.Scanner;

public class Main {
    static void pyramidGenerator()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many rows do you want in your pyramid?");
        int rows = sc.nextInt();
        System.out.println("Which pattern do you want in your pyramid (1-6)");
        int pattern = sc.nextInt();
        while (pattern < 1 || pattern > 6) {
            System.out.println("Invalid number, try again");
            System.out.println("Which pattern do you want in your pyramid (1-6)");
            pattern = sc.nextInt();
        }
        System.out.println("You have chosen pattern number " + pattern + ", here is your pyramid:");
        switch (pattern) {
            case 1: {
                int k = 1;
                for (int i = 1; i <= rows; i++) {
                    for (int j = 0; j < rows - i; j++) {
                        System.out.print(" ");
                    }
                    while (k <= i) {
                        System.out.print(i + " ");
                        k++;
                    }
                    k = 1;
                    System.out.println();
                }
            }
            break;
            case 2: {
                for (int i = 1; i <= rows; i++) {
                    for (int j = 0; j < rows - i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k < i; k++) {
                        System.out.print(k + " ");
                    }
                    System.out.println();
                }
            }
            break;
            case 3: {
                for (int i = 1; i <= rows; i++) {
                    for (int j = 0; j < rows - i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k < i; k++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
            }
            break;
            case 4: {
                for (int i = 1; i <= rows; i++) {
                    for (int j = 0; j < (rows - i) * 2; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= i; k++) {
                        System.out.print(k + " ");
                    }
                    for (int n = i - 1; n > 0; n--) {
                        System.out.print(n + " ");
                    }
                    System.out.println();
                }
            }
            break;
            case 5: {
                for (int i = 1; i <= rows; i++) {
                    for (int j = 0; j < i * 2; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= rows - i; k++) {
                        System.out.print(k + " ");
                    }
                    for (int n = rows - i + 1; n > 0; n--) {
                        System.out.print(n + " ");
                    }
                    System.out.println();
                }
            }
            break;
            case 6: {
                for (int i = 1; i <= rows; i++) {
                    for (int j = 0; j < (rows - i) * 2; j++) {
                        System.out.print(" ");
                    }
                    for (int k = rows - i + 1; k <= rows; k++) {
                        System.out.print(k + " ");
                    }
                    for (int n = rows - 1; n > rows - i; n--) {
                        System.out.print(n + " ");
                    }
                    System.out.println();
                }
            }
            break;
        }
    }
    public static void main(String[] args) {
        pyramidGenerator();
    }
}