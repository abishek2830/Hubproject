import java.util.*;
public class demo {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter the n number:");
        int n=scan.nextInt();
        int a[]=new int[n];
        int i=0;
        while (i<n) {
            System.out.println("enter the values:");
            a[i]=scan.nextInt();
            i++;
        }
        while (i<n) {
            System.out.println("entered number:"+a[i]);
            i++;
        }
    }
}