public class calculator{
    public int add(int num1,int num2){
        int num3=num1+num2;
        return num3;
    }
    public int multiple(int x,int y){
        int z=x*y;
        return z;
    }
    public int divide(int x,int y){
       int  z=x/y;
        return z;
    }
    public int subtract(int num1,int num2){
        int num3=num1-num2;
        return num3;
    }
    public static void main(String args[]){
        calculator a=new calculator( );
        int i=a.add(13,24);
        int j=a.multiple(24,46);
        int k=a.divide(254,6);
        int l=a.subtract(123,45);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);

    }
}