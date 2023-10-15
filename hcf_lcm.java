import java.util.Scanner;
public class hcf_lcm {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        while(b%a!=0){
            int rem =b%a;
            b=a;
            a=rem;
        }
        int gcd=a;
        System.out.println(gcd);
        int lcm = (a*b)/gcd;
        System.out.println(lcm);
        
    }
    
}
