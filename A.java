import java.util.*;
public class A{
    public static void main(String args[]){

        Scanner obj = new Scanner(System.in);

        int testCases = obj.nextInt();

        for(int i = 0; i < testCases; i++){
            int a = obj.nextInt();
            int b = obj.nextInt();
            

            if(a >=1 && b >=1){
                int s = 1 + (a+(b)*2);
                System.out.println(s);
            }
            else if(a>=1 && b ==0){
                System.out.println(a+1);
            }
            else if( a==0 && b>=1){
                System.out.println(1);
            }
            else if(a == 0 && b == 0){
                System.out.println(1);
            }                 
        }
    }
}
