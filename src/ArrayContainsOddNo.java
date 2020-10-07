import java.util.Scanner;

public class ArrayContainsOddNo {

    public static void main(String[]args){

        Scanner s = new Scanner(System.in);
        System.out.println("enter the numbers in an array:");
        int n = s.nextInt();
        int a[] = new int[n];
        for(int i =0; i<n;i++) {
            a[i] = s.nextInt();
        }
        System.out.println("odd numbers are there true");
        for(int i =0;i<n;i++){
            if(a[i]%2!=0){
                System.out.println(a[i]+"");
            }
        }
        System.out.println(" ");
    }

}
