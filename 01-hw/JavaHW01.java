import java.util.Scanner;

public class JavaHW01 {
    public static void main(String[] args) {
        exercise1_1();
        exercise1_2();
        exercise1_3();
        exercise1_4();
    }

    public static void exercise1_1() {
        System.out.println("Exercise 1.1 Output:");
        for (int i = 1; i < 20; i++) {
            if (i % 3 == 0)
                continue;
            if (i % 4 == 0)
                i++;
            if (i > 10)
                break;
            System.out.println(i);
        }
    }

    public static void exercise1_2() {
        System.out.println("\nExercise 1.2 Output:");
        boolean b = true;
        int z = 0, i = 0, c = 0;

        if (i == 11) {
            if (b) {
                c = 8;
            } else if (!b) {
                c = 3;
            } else {
                c = 6;
            }
        } else if (i == 12 || i == 13) {
            z = 10;
        } else {
            z = 15;
        }
        System.out.println("z = " + z + ", c = " + c);
    }

    public static void exercise1_3() {
        System.out.println("\nExercise 1.3 Output:");
        int x = -5;
        int power = 512;
        boolean y = true;
        double item = 1.5;
        double MIN = -12.0;
        char DAY = 'M';
        int num = 12;
        int MAX = 512;
        int Sens = 12;
        
        System.out.println("Condition 1: " + ((x > num) && !y));
        System.out.println("Condition 2: " + ((item > MIN) || (DAY != 'M')));
        System.out.println("Condition 3: " + (((num * 128) < power) && y));
        System.out.println("Condition 4: " + ((!(power != MAX)) && (Sens==num)));
        System.out.println("Condition 5: " + (((MIN + x) < num) || (DAY == 'M')));
        System.out.println("Condition 6: " + ((Sens * 0) != 0));
        System.out.println("Condition 7: " + ((!true || y) && (!y || false)));
    }

    public static void exercise1_4() {
        System.out.println("\nExercise 1.4 Output:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int num = scanner.nextInt();
        
        for (int i = 1; i <= num; i++) {
            for (int j = num; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        scanner.close();
    }
}
