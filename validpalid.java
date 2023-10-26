public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        // Remove non-alphanumeric characters and convert to lowercase
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        // Compare the modified string with its reverse
        String reversed = new StringBuilder(s).reverse().toString();
        
        return s.equals(reversed);
    }

    public static void main(String[] args) {
        String str1 = "A man, a plan, a canal, Panama";
        String str2 = "race a car";
        
        System.out.println(isPalindrome(str1)); // Output: true
        System.out.println(isPalindrome(str2)); // Output: false
    }
}
