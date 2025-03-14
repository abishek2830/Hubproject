import java.util.*;
public class File1 {
    public static void main(String[] args) {
        String a[]={"a","e","i","o","u"};
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the letter");
        String s=input.nextLine();
        int detect=0;
        int i=0;
        while(i<5){
            if(s.equals(a[i])){
                detect = 1;
            }
            i=i+1;
        }
        if(detect==1){
            System.out.println("Its a Vowel");
        }
        else{
            System.out.println("Its not a Vowel");
        }

    }
}

