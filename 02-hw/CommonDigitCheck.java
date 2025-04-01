import java.util.Scanner;

class CommonDigitCheck {
    public static boolean hasCommonDigit(int num1, int num2) {
        if (num1 < 0 || num1 > 1000 || num2 < 0 || num2 > 1000) {
            return false;
        }
        String strNum1 = Integer.toString(num1);
        String strNum2 = Integer.toString(num2);
        
        for (char digit : strNum1.toCharArray()) {
            if (strNum2.indexOf(digit) != -1) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.println(hasCommonDigit(num1, num2));
        scanner.close();
    }
}