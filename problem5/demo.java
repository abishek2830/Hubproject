public class  demo{
    public static void main(String args[]){
        int count=0;
        for(int year=2020;year<2031;year++){
            if(year%4==0){
                System.out.println("Leap years are:"+year);
                count++;
            }
        }
        System.out.println("Total number of years:"+count);
    }
}
        