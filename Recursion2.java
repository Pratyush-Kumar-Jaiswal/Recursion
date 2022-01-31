import java.util.Scanner;

public class Recursion2 {
    void print(int n){
        if(n==1){
            System.out.println(n);
            return ;
        }
        else{
            print(n-1);
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        Recursion2 obj= new Recursion2();
        obj.print(n);
    }
}
