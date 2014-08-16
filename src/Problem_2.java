/**
 * Created by akleiner24 on 7/8/2014.
 * Problem 2 submission for Project Euler
 */
public class Problem_2 {
    public static void main(String[] args){
        //set up counting until 4 million
        long first = 1l;
        long second = 1l;
        int num = 2;
        long intermediate = 0;
        long sum = 0;
        do{
            intermediate = first + second;
            second = first;
            first = intermediate;
            if(first % 2 == 0) sum += first;

            num++; //just used for keeping track of which fibonacci number
        }while(first < 4000000);
        System.out.println(sum); //4613732
    }
}
