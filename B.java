import java.io.*
;
import java.util.Arrays;
import java.util.Scanner;

public class B {
    public static void main(String args[]){

        Scanner obj = new Scanner(System.in);

        int testCases = obj.nextInt();

        while(testCases-- >0){
            int candies = obj.nextInt();
            int[] candyArr = new int[candies];
            for(int i =0 ; i < candies; i++){
                candyArr[i] = obj.nextInt();


            }
            if(candies == 1){
                if(candyArr[0] == 1){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }


            }
            else{
                Arrays.sort(candyArr);
                if(candyArr[candies-1]-candyArr[candies-2]<=1){
                    System.out.println("Yes");
    
                }
                else{
                    System.out.println("No");
                }

            }

        }
    }
}
