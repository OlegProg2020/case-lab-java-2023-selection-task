/*
 * Написать на Java метод, проверяющий является ли строка палиндромом.
 */
public class Task3_2 {

    public static boolean isPalindrome(String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }

}
