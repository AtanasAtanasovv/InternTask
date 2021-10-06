import java.util.Scanner;

public class Main {
    public static String decimalToRoman(int x) {
        StringBuilder roman = new StringBuilder();
        while (x > 1000) {
            roman.append("M");
            x -= 1000;
        }
        if (x >= 900) {
            roman.append("CM");
            x -= 900;
        }
        if (x >= 500) {
            roman.append("D");
            x -= 500;
        }
        if (x >= 400) {
            roman.append("CD");
            x -= 400;
        }
        while (x >= 100) {
            roman.append("C");
            x -= 100;
        }
        if (x >= 90) {
            roman.append("XC");
            x -= 90;
        }
        if (x >= 50) {
            roman.append("L");
            x -= 50;
        }
        if (x >= 40) {
            roman.append("XL");
            x -= 40;
        }
        while (x >= 10) {
            roman.append("X");
            x -= 10;
        }
        if (x == 9) {
            roman.append("IX");
            x -= 9;
        }
        if (x >= 5) {
            roman.append("V");
            x -= 5;
        }
        if (x == 4) {
            roman.append("IV");
            x -= 4;
        }
        while (x >= 1) {
            roman.append("I");
            x -= 1;
        }
        return roman.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number between 1 and 3999");
            int x = sc.nextInt();
            while (x < 1 || x > 3999) {
                System.out.println("Wrong number,try again:");
                x = sc.nextInt();
            }
            System.out.println("The roman equivalent of your number is: " + decimalToRoman(x));
            System.out.println("*************************************************************");
        }
    }
}
