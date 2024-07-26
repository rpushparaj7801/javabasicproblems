package oops;

class father{
    public void house(){
        System.out.println("i have own house");
    }
}
class son extends father{
    public void car(){
        System.out.println("i have own car");
    }
    public void house(){
        System.out.println("this is oops.son house");
    }

}

public class inheritance {
    public static void main(String[] args) {

        son s=new son();
        s.car();
        s.house();
        father f = new father();
        f.house();




    }
}
