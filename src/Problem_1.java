/**
 * Created by akleiner24 on 7/8/2014.
 * Problem 1 submission for Project Euler
 */
public class Problem_1 {
    public static void main(String[] args){
        int count = 0;
        for(int i = 0; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                count += i;
            }
        }

        System.out.println(count); //233168
    }
}
