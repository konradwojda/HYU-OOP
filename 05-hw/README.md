# Object Oriented Programming - Handout 5

Konrad Wojda, 9307820244

## Exercise 1

### Code

```java
class _Character {
    protected char ch;
    private static int objectCounter = 0;

    public _Character() {
        objectCounter++;
    }

    public char getCh() {
        return ch;
    }

    public void setCh(char ch) {
        this.ch = ch;
    }

    public static int getObjectCounter() {
        return objectCounter;
    }
}

class _Digit extends _Character {
    public _Digit(char ch) {
        super();
        this.ch = ch;
    }

    public int plus(_Digit other) {
        int a = Character.getNumericValue(this.ch);
        int b = Character.getNumericValue(other.ch);
        return (a + b) % 10;
    }
}

class _Letter extends _Character {
    public _Letter(char ch) {
        super();
        this.ch = ch;
    }
}

class _Vowel extends _Letter {
    public _Vowel(char ch) {
        super(ch);
    }
}

class _Consonant extends _Letter {
    public _Consonant(char ch) {
        super(ch);
    }
}

public class Main {
    public static void main(String[] args) {
        _Digit d1 = new _Digit('5');
        _Digit d2 = new _Digit('6');
        _Letter l1 = new _Letter('a');
        _Letter l2 = new _Letter('b');
        _Vowel v1 = new _Vowel('e');
        _Vowel v2 = new _Vowel('i');
        _Consonant c1 = new _Consonant('k');
        _Consonant c2 = new _Consonant('m');
        _Character ch1 = new _Character();
        _Character ch2 = new _Character();

        System.out.println("Result of d1.plus(d2): " + d1.plus(d2));
        System.out.println("Total object count: " + _Character.getObjectCounter());
    }
}

```

### Execution

```bash
konradwojda@konradwojda-comp:~/studia/oop-hyu/05-hw$ java Main 
Result of d1.plus(d2): 1
Total object count: 10
```