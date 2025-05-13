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
