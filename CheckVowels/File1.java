import java.util.*;
public class File1 {
    public static void main(String[] args) {
        String a[]={"a","e","i","o","u"};
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the letter");
        String s=input.nextLine();
        int i=0;
        while(i<5){
            if(a[i]==s){
                System.out.println("Its a Vowel");
        }        
            else{

                       System.out.println("its not a vowel");
        }
    }
}
