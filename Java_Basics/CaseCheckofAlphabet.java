import java.util.Scanner;

public class CaseCheckofAlphabet {
    public static void main(String[] args) {
        Scanner sc=new Scanner((System.in));
        System.out.println();
        System.out.println("enter the cracter:");
        char ch= sc.next().trim().charAt(0);  //trim removes the spaces and charAt gives character at pecific index
        if (ch>='a' && ch<='z') {
            System.out.println("lowwercase");
        }
        else{
            System.out.println("uppercase");
        }
        System.out.println(ch);

    }
}
