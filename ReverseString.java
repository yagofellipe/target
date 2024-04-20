public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello, World!";
        char[] chars = new char[str.length()];
        int index = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            chars[index] = str.charAt(i);
            index++;
        }
        String reversedStr = new String(chars);
        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reversedStr);
    }
}