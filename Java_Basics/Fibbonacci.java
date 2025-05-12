import java.util.Scanner;

public class Fibbonacci {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println();

        // 0 ,1,1,2,3,5,8,13,21,,,,,,,,,,,,,,,,
        //find nth fibbonnacci number
        int a=0 ,b=1;
        System.out.println("enteer the number");
        int n=in.nextInt();
        int count=2;
        while (count<=n) {
            int temp=b;
            b=b+a;
            a=temp;
            count++;
            
        }
        System.out.println(b);

    }
}
