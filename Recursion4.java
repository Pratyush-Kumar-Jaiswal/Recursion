import java.util.Scanner;

public class Recursion4 {
    int sum(int[] arr, int n){
        if(n==0)
            return 0;
        else
            return arr[n-1]+sum(arr,n-1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int[] arr =new int[n];
        System.out.println("Enter the array");
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        Recursion4 obj=new Recursion4();
        System.out.println(obj.sum(arr,arr.length));
    }
}
