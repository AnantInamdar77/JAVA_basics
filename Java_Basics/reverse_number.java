public class reverse_number {
    public static void main(String[] args) {
        System.out.println();
        int num=2376;
        int ans=0;
        while (num>0) {
            int rem=num%10;  //gives last num
            ans=ans*10+rem;   //to add next number on right side
            num=num/10;         //to get the other number


            
        }
        System.out.println(ans);
    }
}
