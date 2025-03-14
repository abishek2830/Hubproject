public class File1 {
    public void add(int a,int b){
        int c=a+b;
        System.err.println(c);

    }
    public void add(int x,int y, int u){
        int z=x+y+u;
        System.out.println(z);
    }
    public static void main(String[] args) {
        
        File1 o= new File1();
        o.add(1,3);
        o.add(12,34,56);
    }
}
