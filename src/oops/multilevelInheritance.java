package oops;

class grandfather1{
    public void land (){
        System.out.println("5 acres of land");
    }
}
class father1 extends grandfather1{
    public void land(){
        System.out.println("i have own house");
    }
}




public class multilevelInheritance {
    public static void main(String[] args) {


        grandfather1 g  = new grandfather1();

        grandfather1 g1 = new father1();



        g.land();
        g1.land();



    }
}
