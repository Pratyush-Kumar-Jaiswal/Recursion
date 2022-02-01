import java.util.Scanner;

public class Recursion3 {

    int count(int n){

        if(n!=0){
            return 1+count(n/10);
        }
        else
            return 0;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        Recursion3 obj= new Recursion3();
        System.out.println(obj.count(n));
    }
}
