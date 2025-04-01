# Object Oriented Programming - Handout 1

Konrad Wojda, 9307820244

## Exercise 2.1

Code:

```java
public class UniqueNumbers {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                for (int k = 1; k <= 5; k++) {
                    if (i != j && i != k && j != k) {
                        System.out.println(i * 100 + j * 10 + k);
                        count++;
                    }
                }
            }
        }
        System.out.println("Total unique 3-digit numbers: " + count);
    }
}
```

Execution:

```
konradwojda@konradwojda:~/studia/oop-hyu/02-hw$ java UniqueNumbers 
123
124
125
132
134
135
142
143
145
152
153
154
213
214
215
231
234
235
241
243
245
251
253
254
312
314
315
321
324
325
341
342
345
351
352
354
412
413
415
421
423
425
431
432
435
451
452
453
512
513
514
521
523
524
531
532
534
541
542
543
Total unique 3-digit numbers: 60
```

## Exercise 2.2

Code:

```java
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
```

Execution:

```
konradwojda@konradwojda:~/studia/oop-hyu/02-hw$ java CommonDigitCheck 
Enter first number: 145
Enter second number: 943
true
konradwojda@konradwojda:~/studia/oop-hyu/02-hw$ java CommonDigitCheck 
Enter first number: 100
Enter second number: 564
false
konradwojda@konradwojda:~/studia/oop-hyu/02-hw$ java CommonDigitCheck 
Enter first number: 2000
Enter second number: 333
false
```