import java.util.Scanner;

public class no_of_occurances {
    public static void main(String[] args) {
        //logic taking a remainder of any numbr give last number
        //   1389%10= 9
        //   1389/10   gives the nmber itself
        System.out.println();
        Scanner in =new Scanner(System.in);
        // int n=47678777;
        // int count=0;
        // while (n>0) {
        //     int rem=n%10;
        //     if(rem==7){
        //         count++;
        //     }
        //     n=n/10;
        // }
        // System.out.println(count);
        System.out.println("enter the number");
        int n=in.nextInt();
        System.out.println("enter the num to calculate frequency of occurance");
        int num=in.nextInt();
        int count=0;
        while (n>0) {
            int rem=n%10;
            if(rem==num){
                count++;
            }
            n=n/10;
            
        }
            System.out.println("the num f occurance of "+num+"is = "+count);



}
}