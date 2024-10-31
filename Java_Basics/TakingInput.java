import java.util.Scanner;
public class TakingInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your Name");
        String name=sc.nextLine();
        System.out.println("enter how many nums U want to print");
        int n=Integer.parseInt(sc.nextLine());  // hear we used nextline() we have converted it to int using Integer.parseInt
        System.out.println("dear"+ name+"the counting is:");
        for (int i = 0; i< n; i++) {
            System.out.println(i);
            
        }

       
    }
    
}
