/**
 * Created by akleiner24 on 7/9/2014.
 * Problem 3 submission for Project Euler
 */
public class Problem_4 {
    public static void main(String[] args){
        long largest = 0;
        for(int i = 100; i < 1000; i++){
            for(int j = 100; j < 1000; j++){
                long product = i * j;
                if(Problem_4.isPalindrome(product) && product > largest) largest = product;
            }
        }

        System.out.println(largest); //906609
    }

    public static boolean isPalindrome(long n){
        String intText = new Long(n).toString();
        return Problem_4.isPalindrome(intText);
    }

    public static boolean isPalindrome(String s){
        int length = s.length();
        for(int i = 0; i < (length/2) + 1; i++){
            if(s.charAt(i) != s.charAt((length-i-1))) return false;
        }
        return true;
    }
}
