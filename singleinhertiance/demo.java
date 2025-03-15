class parent{
    public void add(){
        System.out.println("hellow world");

    }
}
class child extends parent{
    public void display(){
        add();
    }
}
public class demo{
    public static void main(String[] args){
        child obj=new child();
        obj.add();
    }
}
