import java.util.Scanner;

public class Recursion1 {
    public int power(int x,int y){
        if(y==1)
            return x;
        else
            return x*power(x,y-1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the base");
        int x=sc.nextInt();
        System.out.println("Enter the power");
        int y=sc.nextInt();
        Recursion1 obj= new Recursion1();
        System.out.println(obj.power(x,y));
    }
}
