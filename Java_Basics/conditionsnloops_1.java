import java.util.Scanner;
public class conditionsnloops_1 {
    public static void main(String args[]){
    //     int x=10;
    //     if(x%2==0){
    //         System.out.println(x+"is even");
    //     }
    //     else{
    //         System.out.println(x+ "is odd");
    //     }

    int n1=100,n2=20;
    if(n1==n2){
        System.out.println("n1 is equal to n2");
    }
    // else{
    //     if(n1>n2){
    //         System.out.println("n1 grater than n2");
    //     }
    //     else{
            // System.out.println("n2 grater than n1");
    //     }
    //     System.out.println("is not equal");
    // }
    
    // to avid so much code written above we use elseif
    else if(n1>n2){
            System.out.println("n1 grater than n2");

    }
    else{
            System.out.println("n2 grater than n1");


    }

    //Qns1. input marks 90% above excellent ,above 80 <90 good, above70<80 fair, above 60<70 meets expectation,<60 below par

    System.out.println("Enter the marks of student");

    Scanner sc=new Scanner(System.in);
    int marks=sc.nextInt();

    if(marks>90){
        System.out.println("Excellent");
    }
    else if(marks>80 && marks<90){
        System.out.println("Good");
    }
    else if(marks>70 && marks<80){
        System.out.println("Fair");
    }
    else if(marks>60 && marks<70){
        System.out.println("meet expectations");
    }
    else{
        System.out.println("below par");
    }

    }

}
