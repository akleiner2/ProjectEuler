/**
 * Created by akleiner24 on 7/9/2014.
 * Problem 5 submission for Project Euler
 */
public class Problem_5 {
    public static void main(String[] args){
        int[] divisors = new int[20];
        for(int i = 0; i < divisors.length; i++) divisors[i] = i+1;
        int num = 20;
        boolean flag = false;
        while(true){
            for(int i = 0; i < divisors.length; i++){
                int curDivisor = divisors[i];
                if(num % curDivisor != 0) break;

            }
        num++;
        }
    }
}
