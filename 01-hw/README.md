# Object Oriented Programming - Handout 1

Konrad Wojda, 9307820244

## Exercise 1.1

```java
for (int i = 1; i < 20; i++)
{
    if (i % 3 == 0)
		continue;
	if (i % 4 == 0)
		i++;
	if (i > 10)
		break;
	System.out.println(i);
}
```

Output of this code is 

```
1
2
5
7
9
10
```

## Exercise 1.2

```java
boolean b = true;
		int z = 0, i = 0, c = 0;

		switch (i) {
			case 11:
				c = b ? 8 : !b ? 3 : 6;
				break;
			case 12:
			case 13:
				z = 10;
				break;

			default:
				z = 15;
		}
```

Rewritten code with only if-else:

```java
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
```

## Exercise 1.3

Results are:

| Condition                                  | Value |
|--------------------------------------------|-------|
| (x > num) && !y                            | false |
| (item > MIN) \|\| (DAY != 'M')               | true  |
| ((num * 128) < power) && y                 | false |
| (!(power != MAX)) && (Sens == num)         | true  |
| ((MIN + x) < num) \|\| (DAY == 'M')          | true  |
| (Sens * 0) != 0                            | false |
| (!true \|\| y) && (!y \|\| false)              | false |


## Exercise 1.4

Code for given task is:

```java
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
```

For a) we just have to assume that num == 5 and skip scanning part.

Example of usage:

```
Enter number of lines: 5
    1
   212
  32123
 4321234
543212345
```