public class Palindrome {

    public static boolean isPalindrome(String s) {

        if (s.isEmpty() || s == null) {
            return true;
        }




        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            while (!Character.isLetterOrDigit(s.charAt(start)) && start < end) {
                start++;
            }
            while (!Character.isLetterOrDigit(s.charAt(end)) && end > start) {
                end--;
            }

            if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            }

            start++;
            end--;

        }

        return true;
    }




}
