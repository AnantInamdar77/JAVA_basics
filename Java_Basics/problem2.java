import java.util.Scanner;
public class problem2 {
    public static void main(String[] args) {
        // print all prime numbers in between ranges
        Scanner sc=new Scanner(System.in);
        int low=sc.nextInt();
        int high=sc.nextInt();
        for(int n=low;n<=high;n++){
            int count=0;
            // try to divide n & increase count
            for(int div=2;div*div<=n;div++){
                if(n%div==0){
                    count++;
                    break;
                }
            }

            if (count==0) {
                System.out.println(n);
            }
        }



    }
}
