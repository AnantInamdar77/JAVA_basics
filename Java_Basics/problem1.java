import java.util.Scanner;
public class problem1 {
    public static void main(String[] args) {
        // Question 1; Prime Number
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of nums");
        int t=sc.nextInt();

        for(int i=0;i<t ;i++){
            int n=sc.nextInt();

            int count=0;
            for(int div=2; div*div<=n; div++){
                if(n% div==0){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.println("Prime");
            }
            else{
                System.out.println("Not Prime");
            }

            
        }


    }
}
