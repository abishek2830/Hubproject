package DynamicOperation;

import java.util.function.IntPredicate;
import javax.lang.model.util.ElementScanner14;

public class file1 {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        System.out.println("Enter yhe operation you want to perform");
        System.out.println("1.Addition/n 2.Substraction/n 3.Multiplication/n 4.Division");
        int chhose=input.nextInt();
        if(choose==1);
        {
            System.out.println("Enter the number");
            int num1=input.nextInt();
            int num2=input.nextInt();
            int num3=num1+num2;
            System.out.println(num3);
        }
        if(choose==2);{
        System.out.println("Enter the number");
        int num1=input.nextInt();
        int num2=input.nextInt();
        int num3=num1-num2;
        System.out.println(num3);
        }
        if(choose==3);{
        System.out.println("Enter the number");
        int num1=input.nextInt();
        int num2=input.nextInt();
        int num3=num1*num2;
        System.out.println(num3);
    }
    if(choose==4);{
    System.out.println("Enter the number");
    int num1=input.nextInt();
    int num2=input.nextInt();
    int num3=num1/num2;
    System.out.println(num3);
}

    }
    }
    
}
