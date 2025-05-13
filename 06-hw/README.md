# Object Oriented Programming - Handout 6

Konrad Wojda, 9307820244

## Exercise 6.1

### Code

```java
public class MatrixAddition {
    public static int[][] add(int[][] A, int[][] B) {
        int[][] result = new int[5][5];
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                result[i][j] = A[i][j] + B[i][j];
        return result;
    }

    public static void main(String[] args) {
        int[][] A = {
            {1, 2, 3, 4, 5},
            {1, 2, 3, 4, 5},
            {1, 2, 3, 4, 5},
            {1, 2, 3, 4, 5},
            {1, 2, 3, 4, 5}
        };
        int[][] B = {
            {5, 4, 3, 2, 1},
            {5, 4, 3, 2, 1},
            {5, 4, 3, 2, 1},
            {5, 4, 3, 2, 1},
            {5, 4, 3, 2, 1}
        };

        int[][] result = add(A, B);

        for (int[] row : result) {
            for (int x : row)
                System.out.print(x + " ");
            System.out.println();
        }
    }
}

```

### Execution

```
konradwojda@konradwojda-comp:~/studia/oop-hyu/06-hw$ java MatrixAddition 
6 6 6 6 6 
6 6 6 6 6 
6 6 6 6 6 
6 6 6 6 6 
6 6 6 6 6 
```

## Exercise 6.2

### Code

```java
public class MatrixMultiplication {
    public static int[][] multiply(int[][] A, int[][] B) {
        int n = A.length;
        int m = A[0].length;
        int p = B[0].length;
        int[][] result = new int[n][p];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < p; j++)
                for (int k = 0; k < m; k++)
                    result[i][j] += A[i][k] * B[k][j];
        return result;
    }

    public static void main(String[] args) {
        int[][] A = {
            {1, 2},
            {3, 4}
        };
        int[][] B = {
            {2, 0},
            {1, 2}
        };

        int[][] result = multiply(A, B);

        for (int[] row : result) {
            for (int x : row)
                System.out.print(x + " ");
            System.out.println();
        }
    }
}

```

### Execution

```
konradwojda@konradwojda-comp:~/studia/oop-hyu/06-hw$ java MatrixMultiplication 
4 4 
10 8
```

## Exercise 6.3

### Code

```java
public class StringMethods {
    public static String trim(String s) {
        int start = 0, end = s.length() - 1;
        while (start <= end && s.charAt(start) == ' ') start++;
        while (end >= start && s.charAt(end) == ' ') end--;
        return s.substring(start, end + 1);
    }

    public static String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--)
            sb.append(s.charAt(i));
        return sb.toString();
    }

    public static void main(String[] args) {
        String original = "   Java Homework   ";
        String trimmed = trim(original);
        String reversed = reverse(original);

        System.out.println("Original: '" + original + "'");
        System.out.println("Trimmed: '" + trimmed + "'");
        System.out.println("Reversed: '" + reversed + "'");
    }
}

```

### Execution

```
konradwojda@konradwojda-comp:~/studia/oop-hyu/06-hw$ java StringMethods 
Original: '   Java Homework   '
Trimmed: 'Java Homework'
Reversed: '   krowemoH avaJ   '
```
